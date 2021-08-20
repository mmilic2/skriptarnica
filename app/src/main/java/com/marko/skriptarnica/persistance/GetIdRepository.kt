package com.marko.skriptarnica.persistance

class GetIdRepository {

    fun setSelectedFileId(id: String){
        selectedFileID = id
    }

    fun getFileId() : String = selectedFileID



    companion object{
        var selectedFileID = ""

    }

}