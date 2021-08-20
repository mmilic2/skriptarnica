package com.marko.skriptarnica.ui.homePage.fragments.profile

import androidx.fragment.app.Fragment

import com.marko.skriptarnica.R
import com.marko.skriptarnica.ui.base.BaseFragment

class MyProfileFragment : BaseFragment() {

    override fun getLayoutResourceId(): Int = R.layout.fragment_my_profile

    override fun setupUi() {
    }

    override fun setOnClickListeners() {
    }

    companion object{
        fun getInstance(): Fragment = MyProfileFragment()
    }

}
