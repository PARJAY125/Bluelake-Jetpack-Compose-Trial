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
fun HistoryAbsen(navController: NavController){
    Column {
        Row {
            Button(onClick = { navController.navigate("absensiHistory") }) {
                Text(text = "Absensi")
            }
            Button(onClick = { navController.navigate("cutiHistory") }) {
                Text(text = "Cuti")
            }
        }
        Column {
            Button(onClick = { navController.navigate("detailAbsen") }) {
                Text(text = "Detail Absen")
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
        Text(text = "Absen")
    }
}

@Composable
fun HistoryCuti(navController: NavController){
    Column {
        Row {
            Button(onClick = { navController.navigate("absensiHistory") }) {
                Text(text = "Absensi")
            }
            Button(onClick = { navController.navigate("cutiHistory") }) {
                Text(text = "Cuti")
            }
        }
        Column {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Detail Cuti")
            }
        }
        Row {
            Button(onClick = { navController.navigate("homePage") }) {
                Text(text = "Home")
            }
            Button(onClick = { navController.navigate("cutiHistory") }) {
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
        Text(text = "Cuti")
    }
}


//
//@Preview(showBackground = true)
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
//@Composable
//fun historyCutiPreview() {
//    JetpackComposeBluelakeTheme {
//        historyCuti()
//    }
//}
//
//@Preview(showBackground = true)
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
//@Composable
//fun historyAbsenPreview() {
//    JetpackComposeBluelakeTheme {
//        historyAbsen()
//    }
//}