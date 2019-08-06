package com.example.callerid.di.components

import android.content.SharedPreferences
import com.example.callerid.data.DataManager
import com.example.callerid.data.network.ApiClient
import com.example.callerid.di.modules.AppModule
import dagger.Component
import javax.inject.Singleton

//we need to provide// 1.ApiClient, 2.SharedPreference

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun provideApiClient(): ApiClient
    fun provideSharedPrefs(): SharedPreferences
    fun provideDataManager(): DataManager

}