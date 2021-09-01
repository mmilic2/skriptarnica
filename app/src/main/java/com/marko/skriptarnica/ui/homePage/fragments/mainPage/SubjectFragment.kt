package com.marko.skriptarnica.ui.homePage.fragments.mainPage

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager

import com.marko.skriptarnica.R
import com.marko.skriptarnica.common.*
import com.marko.skriptarnica.persistance.SelectedStudyAndSubjectRepository
import com.marko.skriptarnica.persistance.SubjectTitlesRepository
import com.marko.skriptarnica.ui.adapter.TitlesListAdapter
import com.marko.skriptarnica.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_subject.*

class SubjectFragment : BaseFragment() {

    private val adapter by lazy { TitlesListAdapter(::onTitleClicked) }

    override fun getLayoutResourceId(): Int = R.layout.fragment_subject

    override fun setupUi() {
        setRecyclerView()
        setRecyclerViewData()
    }

    override fun setOnClickListeners() {
        //onSubjectClicked()
    }

    private fun setRecyclerViewData() {
        when(onSmjerClicked){
            RACUNARSTVO_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesRacunarstvo1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računarstvo stručni 1. godina")
                setTitle("Računarstvo stručni 1. godina")
            }
            RACUNARSTVO_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesRacunarstvo2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računarstvo stručni 2. godina")
                setTitle("Računarstvo stručni 2. godina")
            }
            RACUNARSTVO_3_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesRacunarstvo3())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računarstvo stručni 3. godina")
                setTitle("Računarstvo stručni 3. godina")
            }
            AUTOMATIKA_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesAutomatika1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Automatika 1. godina")
                setTitle("Automatika 1. godina")
            }
            AUTOMATIKA_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesAutomatika2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Automatika 2. godina")
                setTitle("Automatika 2. godina")
            }
            AUTOMATIKA_3_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesAutomatika3())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Automatika 3. godina")
                setTitle("Automatika 3. godina")
            }
            ELEKTROENERGETIKA_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesElektroenergetika1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektroenergetika 1. godina")
                setTitle("Elektroenergetika 1. godina")
            }
            ELEKTROENERGETIKA_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesElektroenergetika2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektroenergetika 2. godina")
                setTitle("Elektroenergetika 2. godina")
            }
            ELEKTROENERGETIKA_3_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesElektroenergetika3())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektroenergetika 3. godina")
                setTitle("Elektroenergetika 3. godina")
            }
            ELEKTROTEHNIKA_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplEleInfTeh1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektrotehnika 1. godina")
                setTitle("Elektrotehnika 1. godina")
            }
            ELEKTROTEHNIKA_2_GODINA_EE -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplEleInfTeh2EE())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektrotehnika 2. godina EE")
                setTitle("Elektrotehnika 2. godina EE")
            }
            ELEKTROTEHNIKA_2_GODINA_KI -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplEleInfTeh2KI())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektrotehnika 2. godina KI")
                setTitle("Elektrotehnika 2. godina KI")
            }
            ELEKTROTEHNIKA_3_GODINA_EE -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplEleInfTeh3EE())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektrotehnika 3. godina EE")
                setTitle("Elektrotehnika 3. godina EE")
            }
            ELEKTROTEHNIKA_3_GODINA_KI -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplEleInfTeh3KI())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektrotehnika 3. godina KI")
                setTitle("Elektrotehnika 3. godina KI")
            }
            PREDDIPL_RACUNARSTVO_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplRac1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računarstvo 1. godina")
                setTitle("Računarstvo 1. godina")
            }
            PREDDIPL_RACUNARSTVO_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplRac2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računarstvo 2. godina")
                setTitle("Računarstvo 2. godina")
            }
            PREDDIPL_RACUNARSTVO_3_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesPredDiplRac3())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računarstvo 3. godina")
                setTitle("Računarstvo 3. godina")
            }
            RACUNALNO_INZENJERSTVO_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesRacIng1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računalno inženjerstvo 1. godina")
                setTitle("Računalno inženjerstvo 1. godina")
            }
            RACUNALNO_INZENJERSTVO_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesRacIng2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Računalno inženjerstvo 2. godina")
                setTitle("Računalno inženjerstvo 2. godina")
            }
            ROBOTIKA_UMJETNA_INTELIGENCIJA_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesRobotika1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Robotika i umjetna inteligencija 1. godina")
                setTitle("Robotika i umjetna inteligencija 1. godina")
            }
            ROBOTIKA_UMJETNA_INTELIGENCIJA_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesRobotika2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Robotika i umjetna inteligencija 2. godina")
                setTitle("Robotika i umjetna inteligencija 2. godina")
            }
            PROGRAMSKO_INZENJERSTVO_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesProgIng1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Programsko inženjerstvo 1. godina")
                setTitle("Programsko inženjerstvo 1. godina")
            }
            PROGRAMSKO_INZENJERSTVO_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesProgIng2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Programsko inženjerstvo 2. godina")
                setTitle("Programsko inženjerstvo 2. godina")
            }
            INFORMACIJSKE_PODATKOVNE_ZNANOSTI_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesInfPodZnanosti1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Informacijske i podatkovne znanosti 1. godina")
                setTitle("Informacijske i podatkovne znanosti 1. godina")
            }
            INFORMACIJSKE_PODATKOVNE_ZNANOSTI_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesInfPodZnanosti2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Informacijske i podatkovne znanosti 2. godina")
                setTitle("Informacijske i podatkovne znanosti 2. godina")
            }
            KOMUNIKACIJSKE_TEHNOLOGIJE_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesKomTeh1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Komunikacijske tehnologije 1. godina")
                setTitle("Komunikacijske tehnologije 1. godina")
            }
            KOMUNIKACIJSKE_TEHNOLOGIJE_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesKomTeh2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Komunikacijske tehnologije 2. godina")
                setTitle("Komunikacijske tehnologije 2. godina")
            }
            MREZNE_TEHNOLOGIJE_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesMrezneTeh1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Mrežne tehnologije 1. godina")
                setTitle("Mrežne tehnologije 1. godina")
            }
            MREZNE_TEHNOLOGIJE_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesMrezneTeh2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Mrežne tehnologije 2. godina")
                setTitle("Mrežne tehnologije 2. godina")
            }
            ELEKTROENERGETSKI_SUSTAVI_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesElektroenergSustavi1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektroenergetski sustavi 1. godina")
                setTitle("Elektroenergetski sustavi 1. godina")
            }
            ELEKTROENERGETSKI_SUSTAVI_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesElektroenergSustavi2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Elektroenergetski sustavi 2. godina")
                setTitle("Elektroenergetski sustavi 2. godina")
            }
            ODRZIVA_ELEKTROENERGETIKA_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesOdrzivaElektroenergetika1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Održiva elektroenergetika 1. godina")
                setTitle("Održiva elektroenergetika 1. godina")
            }
            ODRZIVA_ELEKTROENERGETIKA_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesOdrzivaElektroenergetika2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Održiva elektroenergetika 2. godina")
                setTitle("Održiva elektroenergetika 2. godina")
            }
            INDUSTRIJSKA_ELEKTROENERGETIKA_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesIndustrijskaElektroenergetika1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Industrijska elektroenergetika 1. godina")
                setTitle("Industrijska elektroenergetika 1. godina")
            }
            INDUSTRIJSKA_ELEKTROENERGETIKA_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesIndustrijskaElektroenergetika2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Industrijska elektroenergetika 2. godina")
                setTitle("Industrijska elektroenergetika 2. godina")
            }
            AUTOMOBILSKO_RACUNARSTVO_ENG_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesAutoRacEng1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Automobilsko računarstvo i komunikacije na engleskom jeziku 1. godina")
                setTitle("Automobilsko računarstvo i komunikacije na engleskom jeziku 1. godina")
            }
            AUTOMOBILSKO_RACUNARSTVO_ENG_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesAutoRacEng2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Automobilsko računarstvo i komunikacije na engleskom jeziku 2. godina")
                setTitle("Automobilsko računarstvo i komunikacije na engleskom jeziku 2. godina")
            }
            AUTOMOBILSKO_RACUNARSTVO_1_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesAutoRac1())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Automobilsko računarstvo i komunikacije 1. godina")
                setTitle("Automobilsko računarstvo i komunikacije 1. godina")
            }
            AUTOMOBILSKO_RACUNARSTVO_2_GODINA -> {
                adapter.setData(SubjectTitlesRepository().getTitlesAutoRac2())
                SelectedStudyAndSubjectRepository().setSelectedStudy("Automobilsko računarstvo i komunikacije 2. godina")
                setTitle("Automobilsko računarstvo i komunikacije 2. godina")
            }
        }
    }

    fun onTitleClicked(title: String){
        SelectedStudyAndSubjectRepository().setSelectedSubject(title)
        activity?.showFragment(R.id.homePageFragmentContainer, ScriptFragment.getInstance())
    }

    private fun setRecyclerView() {
        subjectRecyclerView.layoutManager = LinearLayoutManager(context)
        subjectRecyclerView.adapter = adapter
    }

    companion object{
        fun getInstance(): Fragment = SubjectFragment()
        var onSmjerClicked = 0
    }

}
