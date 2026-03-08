package com.example.healthyeatingapp.viewmodel
// ViewModel responsible for handling fruit search logic and API calls
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.healthyeatingapp.api.RetrofitInstance
import com.example.healthyeatingapp.data.Fruit
import kotlinx.coroutines.launch
// Calls the API and updates UI state with the result
class FruitViewModel : ViewModel() {

    var fruit = mutableStateOf<Fruit?>(null)
        private set

    var errorMessage = mutableStateOf<String?>(null)
        private set

    fun searchFruit(name: String) {
        viewModelScope.launch {
            try {
                errorMessage.value = null
                fruit.value = RetrofitInstance.api.getFruit(name.trim().lowercase())
            } catch (e: Exception) {
                fruit.value = null
                errorMessage.value = "Fruit not found or API error."
            }
        }
    }
}