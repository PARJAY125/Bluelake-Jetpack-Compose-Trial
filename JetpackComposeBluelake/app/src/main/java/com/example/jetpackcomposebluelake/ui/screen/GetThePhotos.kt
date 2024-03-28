package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun GetThePhotos() {

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Silang")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Centang")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GetThePhotosPreview() {
    JetpackComposeBluelakeTheme {
        GetThePhotos()
    }
}