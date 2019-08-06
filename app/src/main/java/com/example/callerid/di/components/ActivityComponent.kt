package com.example.callerid.di.components

import com.example.callerid.MainActivity
import com.example.callerid.di.annotations.ActivityScope
import com.example.callerid.di.modules.ActivityModule
import com.example.callerid.di.modules.AppModule
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [AppComponent::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}