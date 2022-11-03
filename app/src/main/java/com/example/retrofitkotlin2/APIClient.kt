package com.example.retrofitkotlin2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    private val retrofit = Retrofit.Builder().baseUrl("https://mocki.io/v1/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    internal val service = retrofit.create(APIService::class.java)

}