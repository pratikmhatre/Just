package com.example.callerid.di.components

import com.example.callerid.data.network.ApiInterface
import com.example.callerid.data.sharedprefs.PrefsFace
import com.example.callerid.di.modules.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun providePrefsFace(): PrefsFace
    fun provideRetrofit():ApiInterface
}