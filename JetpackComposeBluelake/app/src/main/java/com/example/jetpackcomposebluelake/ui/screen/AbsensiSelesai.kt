package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Column
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
fun AbsensiSelesai(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = { navController.navigate("homePage") }) {
            Text(text = "Menu Utama")
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
