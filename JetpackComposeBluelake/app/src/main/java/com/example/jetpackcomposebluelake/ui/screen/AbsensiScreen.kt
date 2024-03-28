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
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Absen Sekarang")
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Beranda")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "History")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Absen")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Pengajuan")
            }
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Wallet")
        }
    }
}