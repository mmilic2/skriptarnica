package com.marko.skriptarnica.model

import com.google.gson.annotations.SerializedName

data class BackendTask(
    @SerializedName("id") val id: String,
    @SerializedName("fileName") val fileName: String,
    @SerializedName("fileType") val fileType: String,
    @SerializedName("study") val study: String,
    @SerializedName("subject") val subject: String,
    @SerializedName("comments") val comment: String
)