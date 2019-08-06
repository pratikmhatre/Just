package com.example.callerid.data.network

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {
    @GET("")
    fun doLogin(@Query("uname") username: String, @Query("password") password: String): Call<List<String>>
}