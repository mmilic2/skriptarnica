package com.marko.skriptarnica.ui.base

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.marko.skriptarnica.Skriptarnica
import com.marko.skriptarnica.ui.homePage.HomePageActivity

abstract class BaseFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutResourceId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUi()
        setOnClickListeners()
    }

    protected fun startActivity(newActivity: Class<*>){
        val intent = Intent(Skriptarnica.instance, newActivity)
        startActivity(intent)
    }

    protected fun setTitle(title: String){
        (activity as HomePageActivity?)?.supportActionBar?.title = title
    }

    abstract fun getLayoutResourceId(): Int
    abstract fun setupUi()
    abstract fun setOnClickListeners()
}