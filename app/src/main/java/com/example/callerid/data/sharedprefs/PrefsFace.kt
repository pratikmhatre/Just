package com.example.callerid.data.sharedprefs

interface PrefsFace {
    fun saveUserName(userName: String)
    fun savePassword(password: String)
    fun getUsername(): String
    fun getPassword(): String
}