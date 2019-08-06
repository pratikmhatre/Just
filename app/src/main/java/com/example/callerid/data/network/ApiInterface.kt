package com.example.callerid.data.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    fun doLogin(username:String , password:String):Call<List<String>>
}