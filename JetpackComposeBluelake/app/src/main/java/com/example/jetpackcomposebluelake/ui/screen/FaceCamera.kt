package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun FaceCamera(navController: NavController) {
    Row (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = { navController.navigate("dataMasuk") }) {
            Text(text = "Batal")
        }
        Button(onClick = { navController.navigate("ambilGambar") }) {
            Text(text = "Ambil Gambar")
        }
        Button(onClick = { navController.navigate("dataMasuk") }) {
            Text(text = "Balik Kamera")
        }
    }
}