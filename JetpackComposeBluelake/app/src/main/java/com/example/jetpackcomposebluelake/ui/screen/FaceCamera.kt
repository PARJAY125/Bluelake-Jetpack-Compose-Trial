package com.example.jetpackcomposebluelake.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun FaceCamera() {
    Row (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Batal")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Ambil Gambar")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Balik Kamera")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FaceCameraPreview() {
    JetpackComposeBluelakeTheme {
        FaceCamera()
    }
}