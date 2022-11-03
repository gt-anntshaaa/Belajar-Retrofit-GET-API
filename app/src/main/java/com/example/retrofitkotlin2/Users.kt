package com.example.retrofitkotlin2


import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("email")
    val email: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("username")
    val username: String
)