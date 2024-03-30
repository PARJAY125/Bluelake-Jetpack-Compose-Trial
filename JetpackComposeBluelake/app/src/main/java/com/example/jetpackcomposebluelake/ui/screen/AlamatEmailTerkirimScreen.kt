package com.example.jetpackcomposebluelake.ui.screen

import android.content.res.Configuration
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun AlamatEmailTerkirim(navController: NavController){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Kembali")
    }
}
@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun AlamatEmailTerkirimPreview() {
    JetpackComposeBluelakeTheme {
        Surface {
//            AlamatEmailTerkirim()
        }
    }
}




//@Preview(showBackground = true)
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
//@Composable
//fun AlamatEmailTerkirimPreview() {
//    JetpackComposeBluelakeTheme {
//        AlamatEmailTerkirim()
//    }
//}
