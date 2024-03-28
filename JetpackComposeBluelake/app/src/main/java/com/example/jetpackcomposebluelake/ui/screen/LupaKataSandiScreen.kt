package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun LupaKataSandi(navController: NavController){
    Column {
        Button(onClick = { navController.navigate("alamatEmailTerkirim") }) {
            Text(text = "Kirim")
        }
        Button(onClick = { navController.navigate("loginScreen") }) {
            Text(text = "Kembali")
        }
    }
}
@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun LupaKataSandiPreview() {
    JetpackComposeBluelakeTheme {
        Surface {
            LupaKataSandi(rememberNavController())
        }
    }
}


//@Preview(showBackground = true)
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
//@Composable
//fun LupaKataSandiPreview() {
//    JetpackComposeBluelakeTheme {
//        LupaKataSandi(navController =)
//    }
//}
