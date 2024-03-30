package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

// TODO : Ganti Nama Yang Lebih Rapi

@Composable
fun AlertPengajuan(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = { navController.navigate("homePage") }) {
            Text(text = "Menu Utama")
        }
    }
}