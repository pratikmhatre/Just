package com.example.callerid.di.modules

//we need to provide// 1.ApiClient, 2.SharedPreference

import android.content.Context
import android.content.SharedPreferences
import com.example.callerid.data.DataManager
import com.example.callerid.data.DataManagerClass
import com.example.callerid.data.network.ApiClass
import com.example.callerid.data.network.ApiClient
import com.example.callerid.data.network.ApiInterface
import com.example.callerid.data.sharedprefs.PrefsClass
import com.example.callerid.data.sharedprefs.PrefsFace
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AppModule(val applicationContext: Context) {

    @Provides
    fun provideApiClient(): ApiClient {
        val retrofit = Retrofit.Builder().build()
        return retrofit.create(ApiClient::class.java)
    }

    @Provides
    fun provideSharedPrefs(): SharedPreferences {
        return applicationContext.getSharedPreferences("ABC", Context.MODE_PRIVATE)
    }

    @Provides
    fun provideDataManager(dataManagerClass: DataManagerClass): DataManager {
        return dataManagerClass
    }

}