package com.example.callerid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.callerid.data.sharedprefs.PrefsClass
import com.example.callerid.data.sharedprefs.PrefsFace
import com.example.callerid.di.components.ActivityComponent
import com.example.callerid.di.components.DaggerActivityComponent
import com.example.callerid.di.modules.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var activityComponent: ActivityComponent

    @Inject
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent =
            DaggerActivityComponent.builder().appComponent((applicationContext as MyApplication).appComponent)
                .activityModule(
                    ActivityModule(this)
                ).build()
        activityComponent.inject(this)
    }
}
