package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun homePage(){
    Column {
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Profile")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Keluar")
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

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun loginPagePreview() {
    JetpackComposeBluelakeTheme {
        homePage()
    }
}
