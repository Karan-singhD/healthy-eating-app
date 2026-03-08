package com.example.healthyeatingapp.data
// Fruit object returned from the API
data class Fruit(
    val name: String,
    val nutritions: Nutrition
)
// Nutrition values
data class Nutrition(
    val carbohydrates: Double,
    val protein: Double,
    val fat: Double,
    val calories: Double,
    val sugar: Double
)