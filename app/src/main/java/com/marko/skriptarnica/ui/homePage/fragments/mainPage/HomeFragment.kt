package com.marko.skriptarnica.ui.homePage.fragments.mainPage

import androidx.fragment.app.Fragment

import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.DIPLOMSKI_STUDIJ
import com.marko.skriptarnica.common.PREDDIPLOMSKI_STUDIJ
import com.marko.skriptarnica.common.STRUCNI_STUDIJ
import com.marko.skriptarnica.common.showFragment
import com.marko.skriptarnica.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_home

    override fun setupUi() {
    }

    override fun setOnClickListeners() {
        strucni.setOnClickListener { onStrucniStudijClicked() }
        preddiplomski.setOnClickListener { onPreddiplomskiClicked() }
        diplomski.setOnClickListener { onDiplomskiClicked() }
    }

    private fun onDiplomskiClicked() {
        CourseFragment.studijClicked = DIPLOMSKI_STUDIJ
        activity?.showFragment(R.id.homePageFragmentContainer, CourseFragment.getInstance(), true)
    }

    private fun onPreddiplomskiClicked() {
        CourseFragment.studijClicked = PREDDIPLOMSKI_STUDIJ
        activity?.showFragment(R.id.homePageFragmentContainer, CourseFragment.getInstance(), true)
    }

    private fun onStrucniStudijClicked() {
        CourseFragment.studijClicked = STRUCNI_STUDIJ
        activity?.showFragment(R.id.homePageFragmentContainer, CourseFragment.getInstance(), true)
    }

    companion object{
        fun getInstance(): Fragment = HomeFragment()
    }
}
