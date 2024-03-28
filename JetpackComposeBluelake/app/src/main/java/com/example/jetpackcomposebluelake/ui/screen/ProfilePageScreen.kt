package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ProfilePage(navController: NavController){
    Column {
        Button(onClick = { navController.navigate("homePage") }) {
            Text(text ="Back")
        }
        Button(onClick = { navController.navigate("loginScreen") }) {
            Text(text = "Keluar")
        }
    }
}