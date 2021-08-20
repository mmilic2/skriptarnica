package com.marko.skriptarnica.networking.interactors

import com.marko.skriptarnica.model.BackendTask
import com.marko.skriptarnica.model.FileResponse
import com.marko.skriptarnica.networking.ManageFileApiService
import okhttp3.MultipartBody
import retrofit2.Callback

class ManageFileApiInteractorImpl(private val apiService: ManageFileApiService) : ManageFileApiInteractor {


    override fun downloadFile(id: String, downloadFileCallback: Callback<FileResponse>) {
        apiService.downloadFile(id).enqueue(downloadFileCallback)
    }

    override fun uploadFile(
        request: MultipartBody.Part,
        study: String,
        subject: String,
        uploadFileCallback: Callback<FileResponse>
    ) {
        apiService.uploadFile(request, study, subject).enqueue(uploadFileCallback)
    }

    override fun getFileByStudyAndYear(
        study: String,
        subject: String,
        getFileByStudyAndYearCallback: Callback<List<BackendTask>>
    ) {
        apiService.getFileByStudyAndYear(study, subject).enqueue(getFileByStudyAndYearCallback)
    }

    override fun postFileComment(
        fileId: String,
        comment: String,
        postFileCommentCallback: Callback<BackendTask>
    ){
        apiService.postFileComment(fileId, comment).enqueue(postFileCommentCallback)
    }

}