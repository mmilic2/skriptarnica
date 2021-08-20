package com.marko.skriptarnica

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class Skriptarnica: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

    }

    companion object{
        lateinit var instance: Skriptarnica
            private set
    }
}