package com.marko.skriptarnica.ui.homePage.fragments.mainPage

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.marko.skriptarnica.R
import com.marko.skriptarnica.Skriptarnica
import com.marko.skriptarnica.common.showFragment
import com.marko.skriptarnica.model.BackendTask
import com.marko.skriptarnica.networking.BackendFactory
import com.marko.skriptarnica.persistance.GetIdRepository
import com.marko.skriptarnica.ui.base.BaseFragment
import com.marko.skriptarnica.ui.homePage.FileWebView

import kotlinx.android.synthetic.main.fragment_post_comment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */
class PostCommentFragment : BaseFragment() {

    private val interactor = BackendFactory.getManageFileApiInteractor()
    private val selectedFileIdRepository = GetIdRepository()

    override fun getLayoutResourceId(): Int = R.layout.fragment_post_comment

    override fun setupUi() {

    }

    override fun setOnClickListeners() {
        commentButton.setOnClickListener {
            interactor.postFileComment(selectedFileIdRepository.getFileId(), commentText.text.toString(), postCommentCallback())
        }
        downloadButton.setOnClickListener {
            val intent = Intent(Skriptarnica.instance, FileWebView::class.java)
            intent.putExtra("Url", "http://192.168.1.10:8080/download/" + selectedFileIdRepository.getFileId())
            startActivity(intent)
        }
    }

    private fun postCommentCallback(): Callback<BackendTask> = object :
        Callback<BackendTask> {
        override fun onFailure(call: Call<BackendTask>?, t: Throwable?) {
            Log.d("+++", t.toString())
        }

        override fun onResponse(call: Call<BackendTask>?, response: Response<BackendTask>) {
            if (response.isSuccessful) {
                Log.d("+++", "We got a response!")
                response.body()?.run {
                    Log.d("+++", this.toString())
                }
                activity?.showFragment(R.id.homePageFragmentContainer, ScriptFragment.getInstance(), true)
            }
        }
    }

    companion object{
        fun getInstance(): Fragment =
            PostCommentFragment()
    }

}
