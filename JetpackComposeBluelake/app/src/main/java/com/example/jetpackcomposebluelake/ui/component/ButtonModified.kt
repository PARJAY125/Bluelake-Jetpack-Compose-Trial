package com.example.jetpackcomposebluelake.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun ButtonModified() {
    val openDialog = remember {  mutableStateOf(true) }

    OutlinedButton(
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .height(50.dp)
            .width(140.dp)
            .border(
                BorderStroke(2.dp, Color.Red),
                shape = RoundedCornerShape(5.dp)
            ),

        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFFFF),
            contentColor = Color.Red,
        ),
        onClick = { openDialog.value = true },
    ) {
        Text(text = "Keluar")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    JetpackComposeBluelakeTheme {
        ButtonModified()
    }
}