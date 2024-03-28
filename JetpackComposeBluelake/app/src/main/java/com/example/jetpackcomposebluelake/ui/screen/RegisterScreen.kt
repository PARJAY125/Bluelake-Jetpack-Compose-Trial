package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme
import androidx.navigation.NavController

@Composable
fun RegisterPerusahaan(){
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
        Surface {
            RegisterPerusahaan()
        }
    }
}


@Composable
fun RegisterKaryawan(navController: NavController) {
    Column {
        Row {
            Button(onClick = { navController.navigate("registerKaryawan") }) {
                Text(text = "Daftar Karyawan")
            }
            Button(onClick = { navController.navigate("registerPerusahaan") }) {
                Text(text = "Daftar Perusahaan")
            }
        }
        Column {
            Button(onClick = { navController.navigate("loginScreen") }) {
                Text(text = "Masuk")
            }
            Button(onClick = { navController.navigate("loginScreen") }) {
                Text(text = "Kembali")
            }
            Text(text = "Karyawan")
        }
    }
}

    @Composable
    fun RegisterPerusahaan(navController: NavController) {
        Column {

            Row {
                Button(onClick = { navController.navigate("registerKaryawan") }) {
                    Text(text = "Daftar Karyawan")
                }
                Button(onClick = { navController.navigate("registerPerusahaan") }) {
                    Text(text = "Daftar Perusahaan")
                }
            }
            Column {
                Button(onClick = { navController.navigate("loginScreen") }) {
                    Text(text = "Masuk")
                }
                Button(onClick = { navController.navigate("loginScreen") }) {
                    Text(text = "Kembali")
                }
            }
            Text(text = "Perusahaan")
        }
    }

