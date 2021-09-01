package com.marko.skriptarnica.networking

import com.marko.skriptarnica.model.BackendTask
import com.marko.skriptarnica.model.FileResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface ManageFileApiService {

    @Multipart
    @POST("/upload/{study}/{subject}")
    fun uploadFile(@Part file: MultipartBody.Part, @Path("study") study: String, @Path("subject") subject: String): Call<FileResponse>

    @GET("/download/{id}")
    fun downloadFile(@Path("id") id: String): Call<FileResponse>

    @GET("/files/{study}/{subject}")
    fun getFileByStudyAndYear(@Path("study") study: String, @Path("subject") subject: String): Call<List<BackendTask>>

    @POST("/files/comment/{fileId}")
    fun postFileComment(@Path("fileId") fileId: String, @Body comment: String): Call<BackendTask>

    @GET("/files/{study}/{subject}/{findParam}")
    fun getFilesByStudyAndYearFileNameContaining(@Path("study") study: String, @Path("subject") subject: String, @Path("findParam") findParam: String): Call<List<BackendTask>>
}