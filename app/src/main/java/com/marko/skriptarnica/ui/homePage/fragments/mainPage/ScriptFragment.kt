package com.marko.skriptarnica.ui.homePage.fragments.mainPage

import android.content.ContentResolver
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

import com.marko.skriptarnica.R
import com.marko.skriptarnica.Skriptarnica
import com.marko.skriptarnica.common.showFragment
import com.marko.skriptarnica.model.BackendTask
import com.marko.skriptarnica.model.FileResponse
import com.marko.skriptarnica.model.FilesResponse
import com.marko.skriptarnica.model.User
import com.marko.skriptarnica.networking.BackendFactory
import com.marko.skriptarnica.persistance.GetFileNameRepository
import com.marko.skriptarnica.persistance.GetIdRepository
import com.marko.skriptarnica.persistance.SelectedStudyAndSubjectRepository
import com.marko.skriptarnica.ui.adapter.DataListAdapter
import com.marko.skriptarnica.ui.base.BaseFragment
import com.marko.skriptarnica.ui.homePage.FileWebView
import kotlinx.android.synthetic.main.fragment_script.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import kotlin.math.log

class ScriptFragment : BaseFragment() {

    private val interactor = BackendFactory.getManageFileApiInteractor()
    private val selectedRepository = SelectedStudyAndSubjectRepository()
    private val adapter by lazy { DataListAdapter(::onItemClicked) }
    var db = FirebaseFirestore.getInstance()
    private val selectedFileIdRepository = GetIdRepository()
    private val selectedfileNameRepository = GetFileNameRepository()

    override fun getLayoutResourceId(): Int = R.layout.fragment_script

    override fun setupUi() {
        Log.d("+++", selectedRepository.getSelectedStudy())
        Log.d("+++", selectedRepository.getSelectedSubject())
        scriptRecyclerView.layoutManager = LinearLayoutManager(context)
        scriptRecyclerView.adapter = adapter
        setTitle(selectedRepository.getSelectedSubject())
        interactor.getFileByStudyAndYear(selectedRepository.getSelectedStudy(), selectedRepository.getSelectedSubject(), getScriptsCallback())
    }

    private fun getScriptsCallback(): Callback<List<BackendTask>> = object : Callback<List<BackendTask>> {
        override fun onFailure(call: Call<List<BackendTask>>?, t: Throwable?) {
            Log.d("+++", t.toString())
        }

        override fun onResponse(call: Call<List<BackendTask>>?, response: Response<List<BackendTask>>) {
            if (response.isSuccessful) {
                Log.d("+++", "test")


                response.body()?.run {
                    Log.d("+++", this.toString())
                        adapter.setData(this)

                    /*RESPONSE_OK -> handleOkResponse(response)
                    else -> handleSomethingWentWrong(response)*/
                }
            }
        }
    }


    private fun handleOkResponse(response: Response<FilesResponse>){
        Log.d("+++", "ok")

        response.body()?.files?.run {
            adapter.setData(this)
        }
    }

    private fun handleSomethingWentWrong(response: Response<FilesResponse>){
        Log.d("+++", response.message())
    }

    override fun setOnClickListeners() {
        upload.setOnClickListener {
            val intent = Intent()
                .setType("*/*")
                .setAction(Intent.ACTION_GET_CONTENT)



            startActivityForResult(Intent.createChooser(intent, "Select a file"), 777)


        }
        findButton.setOnClickListener {
            interactor.getFilesByStudyAndYearFileNameContaining(selectedRepository.getSelectedStudy(), selectedRepository.getSelectedSubject(), findEditText.text.toString(), getFilesByStudyAndYearFileNameContainingCallback())
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 777) {

            val path = data?.data?.path.toString()
            Log.d("+++", path)
            val fullFileName = path.substring(path.lastIndexOf(":") + 1)
            val name = fullFileName.split(".")[0]
            val type = fullFileName.split(".")[1]
            val file = data?.data?.let {
                getFileFromUri(requireContext().contentResolver ,data.data, requireContext().cacheDir, name, type)
            }
            //val file = File(filePath)
            val requestFile = MultipartBody.Builder().addFormDataPart("file", file!!.name, RequestBody.create(
                MediaType.parse("multipart/form-data"), file))
            interactor.uploadFile( requestFile.build().part(0) , selectedRepository.getSelectedStudy(), selectedRepository.getSelectedSubject(), uploadFileCallback())
        }
    }

    private fun getFileFromUri(contentResolver: ContentResolver, uri: Uri?, directory: File, prefix: String, suffix: String): File {
        val file =
            File.createTempFile(prefix, ".$suffix", directory)
        file.outputStream().use {
            contentResolver.openInputStream(uri!!)?.copyTo(it)
        }

        return file
    }

    private fun uploadFileCallback(): Callback<FileResponse> = object: Callback<FileResponse> {
        override fun onFailure(call: Call<FileResponse>, t: Throwable) {
            Log.d("+++", t.toString())
        }

        override fun onResponse(call: Call<FileResponse>, response: Response<FileResponse>) {

        }

    }

    private fun downloadFileCallback(): Callback<FileResponse> = object : Callback<FileResponse> {
        override fun onFailure(call: Call<FileResponse>?, t: Throwable?) {
            Log.d("+++", t.toString())
        }

        override fun onResponse(call: Call<FileResponse>?, response: Response<FileResponse>) {
            if (response.isSuccessful) {
                Log.d("+++", "test")


                response.body()?.run {
                    Log.d("+++", this.toString())


                    /*RESPONSE_OK -> handleOkResponse(response)
                    else -> handleSomethingWentWrong(response)*/
                }
            }
        }
    }

    private fun onItemClicked(id: String, fileName: String) {
        val user = FirebaseAuth.getInstance().currentUser
        var email: String = ""
        user?.let {
            email = user.email.toString()
        }
        var dbUser: User = User("")
        db.collection("/user").document(email).get().addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // Document found in the offline cache
                dbUser = User(task.result?.get("profession").toString())
                if(dbUser.profession.equals("Profesor")) {
                    Log.d("+++","nesto")
                    selectedFileIdRepository.setSelectedFileId(id)
                    selectedfileNameRepository.setSelectedFileName(fileName)
                    activity?.showFragment(R.id.homePageFragmentContainer, PostCommentFragment.getInstance(), true)
                } else {
                    val intent = Intent(Skriptarnica.instance, FileWebView::class.java)
                    intent.putExtra("Url", "http://192.168.1.12:8080/download/" + id)
                    startActivity(intent)
                }
            } else {

            }
        }
    }

    private fun getFilesByStudyAndYearFileNameContainingCallback(): Callback<List<BackendTask>> = object : Callback<List<BackendTask>> {
        override fun onFailure(call: Call<List<BackendTask>>?, t: Throwable?) {
            Log.d("+++", t.toString())
        }

        override fun onResponse(call: Call<List<BackendTask>>?, response: Response<List<BackendTask>>) {
            if (response.isSuccessful) {
                Log.d("+++", "test")


                response.body()?.run {
                    Log.d("+++", this.toString())
                    adapter.setData(this)

                    /*RESPONSE_OK -> handleOkResponse(response)
                    else -> handleSomethingWentWrong(response)*/
                }
            }
        }
    }

    companion object{
        private const val RESPONSE_OK = 200
        fun getInstance(): Fragment = ScriptFragment()
        var study = ""
    }

}
