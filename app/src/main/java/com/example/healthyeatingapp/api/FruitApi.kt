package com.example.healthyeatingapp.api

import com.example.healthyeatingapp.data.Fruit
import retrofit2.http.GET
import retrofit2.http.Path

interface FruitApi {
    @GET("fruit/{name}")
    suspend fun getFruit(
        @Path("name") name: String
    ): Fruit
}