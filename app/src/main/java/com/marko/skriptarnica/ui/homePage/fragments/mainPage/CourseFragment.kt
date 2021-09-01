package com.marko.skriptarnica.ui.homePage.fragments.mainPage

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager

import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.*
import com.marko.skriptarnica.persistance.SubjectTitlesRepository
import com.marko.skriptarnica.ui.adapter.TitlesListAdapter
import com.marko.skriptarnica.ui.base.BaseFragment
import com.marko.skriptarnica.ui.homePage.HomePageActivity
import kotlinx.android.synthetic.main.fragment_course.*


class CourseFragment : BaseFragment() {

    private val adapter by lazy { TitlesListAdapter(::onTitleClicked) }

    override fun getLayoutResourceId(): Int = R.layout.fragment_course

    override fun setupUi() {
        when(studijClicked){
            STRUCNI_STUDIJ -> setTitle("Stručni studij")
            PREDDIPLOMSKI_STUDIJ -> setTitle("Preddiplomski studij")
            DIPLOMSKI_STUDIJ -> setTitle("Diplomski studij")
        }
        setRecyclerView()
        setRecyclerViewData()
    }

    private fun setRecyclerViewData() {
        when(studijClicked){
            STRUCNI_STUDIJ -> adapter.setData(SubjectTitlesRepository().getTitlesStrucni())
            PREDDIPLOMSKI_STUDIJ -> adapter.setData(SubjectTitlesRepository().getTitlesPredDipl())
            DIPLOMSKI_STUDIJ -> adapter.setData(SubjectTitlesRepository().getTitlesDipl())
        }
    }

    override fun setOnClickListeners() {
    }

    private fun onTitleClicked(title: String) {
        when(title){
            "Računarstvo stručni 1. godina" -> SubjectFragment.onSmjerClicked = RACUNARSTVO_1_GODINA
            "Računarstvo stručni 2. godina" -> SubjectFragment.onSmjerClicked = RACUNARSTVO_2_GODINA
            "Računarstvo stručni 3. godina" -> SubjectFragment.onSmjerClicked = RACUNARSTVO_3_GODINA
            "Automatika 1. godina" -> SubjectFragment.onSmjerClicked = AUTOMATIKA_1_GODINA
            "Automatika 2. godina" -> SubjectFragment.onSmjerClicked = AUTOMATIKA_2_GODINA
            "Automatika 3. godina" -> SubjectFragment.onSmjerClicked = AUTOMATIKA_3_GODINA
            "Elektroenergetika 1. godina" -> SubjectFragment.onSmjerClicked = ELEKTROENERGETIKA_1_GODINA
            "Elektroenergetika 2. godina" -> SubjectFragment.onSmjerClicked = ELEKTROENERGETIKA_2_GODINA
            "Elektroenergetika 3. godina" -> SubjectFragment.onSmjerClicked = ELEKTROENERGETIKA_3_GODINA
            "Elektrotehnika 1. godina" -> SubjectFragment.onSmjerClicked = ELEKTROTEHNIKA_1_GODINA
            "Elektrotehnika 2. godina EE" -> SubjectFragment.onSmjerClicked = ELEKTROTEHNIKA_2_GODINA_EE
            "Elektrotehnika 2. godina KI" -> SubjectFragment.onSmjerClicked = ELEKTROTEHNIKA_2_GODINA_KI
            "Elektrotehnika 3. godina EE" -> SubjectFragment.onSmjerClicked = ELEKTROTEHNIKA_3_GODINA_EE
            "Elektrotehnika 3. godina KI" -> SubjectFragment.onSmjerClicked = ELEKTROTEHNIKA_3_GODINA_KI
            "Računarstvo 1. godina" -> SubjectFragment.onSmjerClicked = PREDDIPL_RACUNARSTVO_1_GODINA
            "Računarstvo 2. godina" -> SubjectFragment.onSmjerClicked = PREDDIPL_RACUNARSTVO_2_GODINA
            "Računarstvo 3. godina" -> SubjectFragment.onSmjerClicked = PREDDIPL_RACUNARSTVO_3_GODINA
            "Računalno inženjerstvo 1. godina" -> SubjectFragment.onSmjerClicked = RACUNALNO_INZENJERSTVO_1_GODINA
            "Računalno inženjerstvo 2. godina" -> SubjectFragment.onSmjerClicked = RACUNALNO_INZENJERSTVO_2_GODINA
            "Robotika i umjetna inteligencija 1. godina" -> SubjectFragment.onSmjerClicked = ROBOTIKA_UMJETNA_INTELIGENCIJA_1_GODINA
            "Robotika i umjetna inteligencija 2. godina" -> SubjectFragment.onSmjerClicked = ROBOTIKA_UMJETNA_INTELIGENCIJA_2_GODINA
            "Programsko inženjerstvo 1. godina" -> SubjectFragment.onSmjerClicked = PROGRAMSKO_INZENJERSTVO_1_GODINA
            "Programsko inženjerstvo 2. godina" -> SubjectFragment.onSmjerClicked = PROGRAMSKO_INZENJERSTVO_2_GODINA
            "Informacijske i podatkovne znanosti 1. godina" -> SubjectFragment.onSmjerClicked = INFORMACIJSKE_PODATKOVNE_ZNANOSTI_1_GODINA
            "Informacijske i podatkovne znanosti 2. godina" -> SubjectFragment.onSmjerClicked = INFORMACIJSKE_PODATKOVNE_ZNANOSTI_2_GODINA
            "Komunikacijske tehnologije 1. godina" -> SubjectFragment.onSmjerClicked = KOMUNIKACIJSKE_TEHNOLOGIJE_1_GODINA
            "Komunikacijske tehnologije 2. godina" -> SubjectFragment.onSmjerClicked = KOMUNIKACIJSKE_TEHNOLOGIJE_2_GODINA
            "Mrežne tehnologije 1. godina" -> SubjectFragment.onSmjerClicked = MREZNE_TEHNOLOGIJE_1_GODINA
            "Mrežne tehnologije 2. godina" -> SubjectFragment.onSmjerClicked = MREZNE_TEHNOLOGIJE_2_GODINA
            "Elektroenergetski sustavi 1. godina" -> SubjectFragment.onSmjerClicked = ELEKTROENERGETSKI_SUSTAVI_1_GODINA
            "Elektroenergetski sustavi 2. godina" -> SubjectFragment.onSmjerClicked = ELEKTROENERGETSKI_SUSTAVI_2_GODINA
            "Održiva elektroenergetika 1. godina" -> SubjectFragment.onSmjerClicked = ODRZIVA_ELEKTROENERGETIKA_1_GODINA
            "Održiva elektroenergetika 2. godina" -> SubjectFragment.onSmjerClicked = ODRZIVA_ELEKTROENERGETIKA_2_GODINA
            "Industrijska elektroenergetika 1. godina" -> SubjectFragment.onSmjerClicked = INDUSTRIJSKA_ELEKTROENERGETIKA_1_GODINA
            "Industrijska elektroenergetika 2. godina" -> SubjectFragment.onSmjerClicked = INDUSTRIJSKA_ELEKTROENERGETIKA_2_GODINA
            "Automobilsko računarstvo i komunikacije na engleskom jeziku 1. godina" -> SubjectFragment.onSmjerClicked = AUTOMOBILSKO_RACUNARSTVO_ENG_1_GODINA
            "Automobilsko računarstvo i komunikacije na engleskom jeziku 2. godina" -> SubjectFragment.onSmjerClicked = AUTOMOBILSKO_RACUNARSTVO_ENG_2_GODINA
            "Automobilsko računarstvo i komunikacije 1. godina" -> SubjectFragment.onSmjerClicked = AUTOMOBILSKO_RACUNARSTVO_1_GODINA
            "Automobilsko računarstvo i komunikacije 2. godina" -> SubjectFragment.onSmjerClicked = AUTOMOBILSKO_RACUNARSTVO_2_GODINA

        }
        activity?.showFragment(R.id.homePageFragmentContainer, SubjectFragment.getInstance(), true)
    }

    private fun setRecyclerView() {
        homePageRecyclerView.layoutManager = LinearLayoutManager(context)
        homePageRecyclerView.adapter = adapter
    }

    companion object{
        fun getInstance(): Fragment = CourseFragment()
        var studijClicked = 0
    }
}
