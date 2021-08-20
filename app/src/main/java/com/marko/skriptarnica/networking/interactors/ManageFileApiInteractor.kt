package com.marko.skriptarnica.networking.interactors

import com.marko.skriptarnica.model.BackendTask
import com.marko.skriptarnica.model.FileResponse
import okhttp3.MultipartBody
import retrofit2.Callback

interface ManageFileApiInteractor {

    fun downloadFile(id: String, downloadFileCallback: Callback<FileResponse>)

    fun uploadFile(request: MultipartBody.Part, study: String, subject: String, uploadFileCallback: Callback<FileResponse>)

    fun getFileByStudyAndYear(study: String, subject: String, getFileByStudyAndYearCallback: Callback<List<BackendTask>>)

    fun postFileComment(fileId: String, comment: String, postFileCommentCallback: Callback<BackendTask>)

}