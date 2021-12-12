package com.musta.explorehilt

import android.app.Application
import com.example.android.hilt.ServiceLocator

class LogApplication : Application() {

    lateinit var serviceLocator: ServiceLocator

    override fun onCreate() {
        super.onCreate()
        serviceLocator = ServiceLocator(applicationContext)
    }
}
