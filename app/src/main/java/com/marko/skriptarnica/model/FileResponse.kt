package com.marko.skriptarnica.model

data class FileResponse(val id: String, val fileName: String, val fileType: String, val study: String, val data: ByteArray) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FileResponse

        if (id != other.id) return false
        if (fileName != other.fileName) return false
        if (fileType != other.fileType) return false
        if (study != other.study) return false
        if (!data.contentEquals(other.data)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + fileName.hashCode()
        result = 31 * result + fileType.hashCode()
        result = 31 * result + study.hashCode()
        result = 31 * result + data.contentHashCode()
        return result
    }
}