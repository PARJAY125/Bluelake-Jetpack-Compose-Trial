package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

// TODO : Rename Pengajuan Ijin
@Composable
fun PengajuanScreen(navController: NavController) {
    Column{
        Button(onClick = { navController.navigate("alertPengajuan") }) {
            Text(text = "Kirim Pengajuan")
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