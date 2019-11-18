package com.jiadibo.moviecatalogue

import android.app.Application
import com.facebook.stetho.Stetho

class MovieCatalog: Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}