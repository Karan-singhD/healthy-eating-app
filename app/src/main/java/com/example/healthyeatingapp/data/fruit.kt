package com.example.healthyeatingapp.data

data class Fruit(
    val name: String,
    val nutritions: Nutrition
)

data class Nutrition(
    val carbohydrates: Double,
    val protein: Double,
    val fat: Double,
    val calories: Double,
    val sugar: Double
)