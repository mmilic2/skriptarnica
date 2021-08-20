package com.marko.skriptarnica.ui.homePage.fragments.mainPage

import androidx.fragment.app.Fragment

import com.marko.skriptarnica.R
import com.marko.skriptarnica.ui.base.BaseFragment


class YearFragment : BaseFragment() {

    override fun getLayoutResourceId(): Int = R.layout.fragment_year

    override fun setupUi() {
    }

    override fun setOnClickListeners() {
    }

    companion object{
        fun getInstance(): Fragment = YearFragment()
    }

}
