package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposebluelake.ui.component.KeteranganJamKerja
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
    fun loginScreen(navController: NavController){
        Row {
            Button(onClick = { navController.navigate("HomePageScreen") }) {
                Text(text = "Masuk")
            }
            Button(onClick = { navController.navigate("screen2") }) {
                Text(text = "Daftar Sekarang")
            }
            Button(onClick = { navController.navigate("screen2") }) {
                Text(text = "Lupa Kata Sandi")
            }
        }
    }


