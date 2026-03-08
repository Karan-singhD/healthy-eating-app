package com.example.healthyeatingapp.api

import com.example.healthyeatingapp.data.Fruit
import retrofit2.http.GET
import retrofit2.http.Path
// Retrofit API interface for retrieving fruit nutrition data
interface FruitApi {
    @GET("fruit/{name}")
    suspend fun getFruit(
        @Path("name") name: String
    ): Fruit
}