package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.component.KeteranganJamKerja
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
    fun loginScreen(){
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Masuk")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Daftar Sekarang")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Lupa Kata Sandi")
            }

        }
    }

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun LoginScreenPreview() {
    JetpackComposeBluelakeTheme {
        loginScreen()
    }
}
