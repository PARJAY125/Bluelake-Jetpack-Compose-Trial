package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
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
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Detail Cuti")
            }
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Home")
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
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Home")
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
        }}}



@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun historyCutiPreview() {
    JetpackComposeBluelakeTheme {
        HistoryCuti(rememberNavController())
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun historyAbsenPreview() {
    JetpackComposeBluelakeTheme {
        HistoryAbsen(rememberNavController())
    }
}