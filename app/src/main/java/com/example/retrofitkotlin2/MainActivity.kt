package com.example.retrofitkotlin2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitkotlin2.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val call = APIClient.service.getUser()
        call.enqueue(object: Callback<Users>{
            override fun onResponse(call: Call<Users>, response: Response<Users>) {
                val responseBody = response.body()!!

                val Email = responseBody.email

                binding.sample.text = Email
            }

            override fun onFailure(call: Call<Users>, t: Throwable) {
                Log.e(TAG, t.message.toString())
            }
        })
    }
}


