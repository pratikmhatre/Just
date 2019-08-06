package com.example.callerid.data.sharedprefs

import android.content.SharedPreferences
import javax.inject.Inject

class PrefsClass @Inject constructor(val sharedPrefs: SharedPreferences) : PrefsFace {

    override fun saveUserName(userName: String) {
        sharedPrefs.edit().putString("USERNAME", userName).apply()
    }

    override fun savePassword(password: String) {
        sharedPrefs.edit().putString("PASSWORD", password).apply()
    }


    override fun getUsername(): String {
        return sharedPrefs.getString("USERNAME", "")!!
    }

    override fun getPassword(): String {
        return sharedPrefs.getString("PASSWORD", "")!!
    }

}