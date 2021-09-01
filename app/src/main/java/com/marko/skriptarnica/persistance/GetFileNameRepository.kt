package com.marko.skriptarnica.persistance

class GetFileNameRepository {

    fun setSelectedFileName(fileName: String){
        selectedFileName = fileName
    }

    fun getFileName() : String = selectedFileName



    companion object{
        var selectedFileName = ""

    }

}