package com.example.callerid.data

import com.example.callerid.data.network.ApiClass
import com.example.callerid.data.sharedprefs.PrefsClass
import retrofit2.Call
import javax.inject.Inject

class DataManagerClass @Inject constructor(val apiClass: ApiClass, val prefsClass: PrefsClass) : DataManager {

    override fun saveUserName(userName: String) {
        prefsClass.saveUserName(userName)
    }

    override fun savePassword(password: String) {
        prefsClass.savePassword(password)
    }

    override fun getUsername() = prefsClass.getUsername()

    override fun getPassword() = prefsClass.getPassword()

    override fun doLogin(username: String, password: String): Call<List<String>> {
        return apiClass.doLogin(username, password)
    }
}