package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposebluelake.presentation.user.UserEvent
import com.example.jetpackcomposebluelake.presentation.user.UserState
import com.example.jetpackcomposebluelake.ui.component.KeteranganJamKerja
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme


@Composable
fun LoginScreen(
    navController: NavController,
    userState: UserState,
    onEvent: (UserEvent)->Unit
){
    Row {
        Button(onClick = { navController.navigate("homePage") }) {
            Text(text = "Masuk")
        }
        Button(onClick = { navController.navigate("registerKaryawan") }) {
            Text(text = "Daftar Sekarang")
        }
        Button(onClick = { navController.navigate("lupaKataSandiScreen") }) {
            Text(text = "Lupa Kata Sandi")
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun LoginScreenPreview() {
    JetpackComposeBluelakeTheme {
        Surface{
//            LoginScreen(rememberNavController())
        }
    }
}


