package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun ProfilePage(navController: NavController){
    Column {
        Button(onClick = { navController.navigate("homePage") }) {
            Text(text ="Back")
        }
        Button(onClick = { navController.navigate("loginScreen") }) {
            Text(text = "Keluar")
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ProfilePagePreview() {
    JetpackComposeBluelakeTheme {
        Surface {
            ProfilePage(rememberNavController())
        }
    }
}