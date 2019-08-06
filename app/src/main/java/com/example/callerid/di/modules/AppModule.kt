package com.example.callerid.di.modules

import android.content.Context
import android.content.SharedPreferences
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
    fun providePrefsFace(): PrefsFace {
        val sharedPreferences = applicationContext.getSharedPreferences("NAME", Context.MODE_PRIVATE)
        return PrefsClass(sharedPreferences)
    }

    @Provides
    fun provideRetrofit(): ApiInterface {
        val retrofitClient = Retrofit.Builder().baseUrl("").build()
        return ApiClass(retrofitClient.create(ApiClient::class.java))
    }
}
