package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun RegisterKaryawan(navController: NavController) {
    Column {
        Row {
            Button(onClick = { navController.navigate("registerKaryawan") }) {
                Text(text = "Daftar Karyawan")
            }
            Button(onClick = { navController.navigate("registerPerusahaan") }) {
                Text(text = "Daftar Perusahaan")
            }
        }
        Column {
            Button(onClick = { navController.navigate("loginScreen") }) {
                Text(text = "Masuk")
            }
            Button(onClick = { navController.navigate("loginScreen") }) {
                Text(text = "Kembali")
            }
            Text(text = "Karyawan")
        }
    }
}

    @Composable
    fun RegisterPerusahaan(navController: NavController) {
        Column {

            Row {
                Button(onClick = { navController.navigate("registerKaryawan") }) {
                    Text(text = "Daftar Karyawan")
                }
                Button(onClick = { navController.navigate("registerPerusahaan") }) {
                    Text(text = "Daftar Perusahaan")
                }
            }
            Column {
                Button(onClick = { navController.navigate("loginScreen") }) {
                    Text(text = "Masuk")
                }
                Button(onClick = { navController.navigate("loginScreen") }) {
                    Text(text = "Kembali")
                }
            }
            Text(text = "Perusahaan")
        }
    }

