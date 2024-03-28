package com.example.jetpackcomposebluelake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposebluelake.ui.screen.loginScreen
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBluelakeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val nilai = remember { mutableStateOf(0) }

    Column {
        Text(
            text = "Pencet tombol untuk menambah nilai",
            modifier = modifier
        )

        Text(
            text = "${nilai.value}",
            modifier = modifier
        )

        Button(onClick = { nilai.value++ }) {
            Text(
                text = "Tambah nilai",
                modifier = modifier
            )
        }

        OutlinedTextField(
            value = nilai.value.toString(),
            onValueChange = { newValue: String ->
                nilai.value = newValue.toIntOrNull() ?: 0
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { },
            modifier = Modifier.fillMaxWidth()
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeBluelakeTheme {
        Greeting("Android")
    }
}