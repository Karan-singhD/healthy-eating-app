package com.example.healthyeatingapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: FruitApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.fruityvice.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FruitApi::class.java)
    }
}