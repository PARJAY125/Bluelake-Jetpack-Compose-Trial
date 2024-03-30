package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun GetThePhotos(navController: NavController) {
    Row (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = { navController.navigate("faceCamera") }) {
            Text(text = "Silang")
        }
        Button(onClick = { navController.navigate("dataMasuk") }) {
            Text(text = "Centang")
        }
    }
}