package com.example.healthyeatingapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.healthyeatingapp.viewmodel.FruitViewModel

@Composable
fun FruitScreen(viewModel: FruitViewModel) {
    var searchText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text("Healthy Eating App")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Enter a fruit name") },
            singleLine = true
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = { viewModel.searchFruit(searchText) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Search")
        }

        Spacer(modifier = Modifier.height(20.dp))

        viewModel.errorMessage.value?.let { error ->
            Text(error)
        }

        viewModel.fruit.value?.let { fruit ->
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Fruit: ${fruit.name}")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Calories: ${fruit.nutritions.calories}")
                    Text("Sugar: ${fruit.nutritions.sugar} g")
                    Text("Carbohydrates: ${fruit.nutritions.carbohydrates} g")
                    Text("Protein: ${fruit.nutritions.protein} g")
                    Text("Fat: ${fruit.nutritions.fat} g")
                }
            }
        }
    }
}