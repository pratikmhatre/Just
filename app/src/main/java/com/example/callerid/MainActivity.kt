package com.example.callerid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.callerid.data.DataManager
import com.example.callerid.di.components.ActivityComponent
import com.example.callerid.di.components.AppComponent
import com.example.callerid.di.components.DaggerActivityComponent
import com.example.callerid.di.modules.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var dataManager: DataManager

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityComponent =
            DaggerActivityComponent.builder().appComponent((applicationContext as MyApplication).appComponent)
                .activityModule(
                    ActivityModule(this)
                ).build()
        activityComponent.inject(this)
    }
}
