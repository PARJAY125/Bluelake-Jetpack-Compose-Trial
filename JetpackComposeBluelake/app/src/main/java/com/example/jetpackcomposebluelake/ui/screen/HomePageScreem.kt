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
fun HomePage(navController: NavController){
    Column {
        Row {
            Button(onClick = { navController.navigate("profilePage") }) {
                Text(text = "Profile")
            }
            Button(onClick = { navController.navigate("loginScreen") }) {
                Text(text = "Keluar")
            }
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

//@Preview(showBackground = true)
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
//@Composable
//fun loginPagePreview() {
//    JetpackComposeBluelakeTheme {
//        homePage()
//    }
//}
