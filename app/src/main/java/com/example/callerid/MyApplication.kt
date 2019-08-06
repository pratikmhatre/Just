package com.example.callerid

import android.app.Application
import com.example.callerid.di.components.AppComponent
import com.example.callerid.di.components.DaggerAppComponent
import com.example.callerid.di.modules.AppModule

class MyApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}