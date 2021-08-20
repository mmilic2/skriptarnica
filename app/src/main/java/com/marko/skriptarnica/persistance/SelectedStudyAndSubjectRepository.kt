package com.marko.skriptarnica.persistance

class SelectedStudyAndSubjectRepository {

    fun setSelectedSubject(subject: String){
        selectedSubject = subject
    }

    fun setSelectedStudy(study: String){
        selectedStudy = study
    }

    fun getSelectedStudy() : String = selectedStudy

    fun getSelectedSubject() : String = selectedSubject

    companion object{
        var selectedSubject = ""
        var selectedStudy = ""
    }
}