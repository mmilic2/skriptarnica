package com.marko.skriptarnica.ui.base

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marko.skriptarnica.Skriptarnica

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResourceId())
        setupUi()
    }

    protected fun startActivity(newActivity: Class<*>){
        val intent = Intent(Skriptarnica.instance, newActivity)
        startActivity(intent)
    }

    abstract fun getLayoutResourceId(): Int
    abstract fun setupUi()
}