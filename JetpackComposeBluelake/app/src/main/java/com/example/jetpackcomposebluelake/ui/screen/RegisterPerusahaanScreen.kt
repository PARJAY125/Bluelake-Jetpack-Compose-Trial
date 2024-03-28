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
fun registerPerusahaan(){
    Column {


    Row {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Daftar Perusahaan")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Daftar Karyawan")
        }
    }
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Masuk")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Kembali")
        }
    }
}
}
@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun RegisterPerusahaanPreview() {
    JetpackComposeBluelakeTheme {
        registerPerusahaan()
    }
}