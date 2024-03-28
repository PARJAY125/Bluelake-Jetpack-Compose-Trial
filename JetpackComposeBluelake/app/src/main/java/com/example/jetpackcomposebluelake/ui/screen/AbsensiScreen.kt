package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

// TODO : Ganti Nama Yang Lebih Rapi

@Composable
fun AbsensiScreen(navController: NavController) {
    Column{
        Button(onClick = { navController.navigate("dataMasuk") }) {
            Text(text = "Absen Sekarang")
        }
        Row {
            Button(onClick = { navController.navigate("homePage") }) {
                Text(text = "Home")
            }
            Button(onClick = { navController.navigate("absensiHistory") }) {
                Text(text = "History")
            }
            Button(onClick = { navController.navigate("absenPage") }) {
                Text(text = "Absen")
            }
            Button(onClick = { navController.navigate("PengajuanPage") }) {
                Text(text = "Pengajuan")
            }

        }
        Button(onClick = { navController.navigate("walletPage") }) {
            Text(text = "Wallet")
        }
    }
}