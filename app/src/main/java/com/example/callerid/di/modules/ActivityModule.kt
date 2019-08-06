package com.example.callerid.di.modules

import android.content.Context
import com.example.callerid.MyAdapter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activityContext: Context) {
    @Provides
    fun provideMyAdapter(): MyAdapter {
        return MyAdapter(actCotext = activityContext, arrayList = ArrayList())
    }
}