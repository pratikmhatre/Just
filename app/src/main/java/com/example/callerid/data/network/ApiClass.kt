package com.example.callerid.data.network

import retrofit2.Call
import javax.inject.Inject

class ApiClass @Inject constructor(val apiClient: ApiClient) : ApiInterface{
    override fun doLogin(username: String, password: String): Call<List<String>> {
        return apiClient.doLogin(username, password)
    }
}