package com.example.healthyeatingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.healthyeatingapp.ui.FruitScreen
import com.example.healthyeatingapp.ui.theme.HealthyEatingAppTheme
import com.example.healthyeatingapp.viewmodel.FruitViewModel
// Entry point of the application that loads the main UI
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealthyEatingAppTheme {
                val fruitViewModel: FruitViewModel = viewModel()
                FruitScreen(viewModel = fruitViewModel)
            }
        }
    }
}