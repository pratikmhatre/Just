package com.example.callerid.data.sharedprefs

import android.content.SharedPreferences
import javax.inject.Inject

class PrefsClass @Inject constructor(val sharedPrefs: SharedPreferences) : PrefsFace {
    override fun saveUserName(userName: String) {
        sharedPrefs.edit().putString("USERNAME", userName).apply()
    }

    override fun savePassword(password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getUsername(): String {
        return sharedPrefs.getString("USERNAME", "")!!
    }

    override fun getPassword(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}