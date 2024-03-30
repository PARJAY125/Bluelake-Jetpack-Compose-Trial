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

@Composable
fun DataMasuk(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = { navController.navigate("absenPage") }) {
            Text(text = "Kembali")
        }
        Button(onClick = { navController.navigate("faceCamera") }) {
            Text(text = "Absen Sekarang")
        }
        Button(onClick = { navController.navigate("faceCamera") }) {
            Text(text = "Foto Ulang")
        }
        Button(onClick = { navController.navigate("absensiSelesai") }) {
            Text(text = "Absen Sekarang2")
        }
    }
}