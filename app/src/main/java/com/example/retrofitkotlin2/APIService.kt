package com.example.retrofitkotlin2

import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("b75c4491-ccf1-4e0b-a2e8-5c3f2807e038")
    fun getUser():Call<Users>
}