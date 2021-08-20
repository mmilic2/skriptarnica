package com.marko.skriptarnica.ui.homePage.fragments.myScripts

import androidx.fragment.app.Fragment

import com.marko.skriptarnica.R
import com.marko.skriptarnica.ui.base.BaseFragment

class MyScriptsFragment : BaseFragment() {

    override fun getLayoutResourceId(): Int = R.layout.fragment_my_scripts

    override fun setupUi() {
    }

    override fun setOnClickListeners() {
    }

    companion object{
        fun getInstance(): Fragment = MyScriptsFragment()
    }

}
