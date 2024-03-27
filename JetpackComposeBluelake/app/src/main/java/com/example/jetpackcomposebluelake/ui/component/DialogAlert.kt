package com.example.jetpackcomposebluelake.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.jetpackcomposebluelake.R
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun DialogAlert(){
    val openDialog = remember {  mutableStateOf(true) }

    Dialog(
        onDismissRequest = { openDialog.value = false },
        properties = DialogProperties(dismissOnClickOutside = false),
        content = {
            Column(
                modifier = Modifier
                    .width(320.dp)
                    .height(390.dp)
                    .background(Color.White)
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.alertimage),
                    contentDescription = "Alert",
                    modifier = Modifier
                        .width(200.dp) // Set the width to 200dp
                        .height(250.dp)
                )

                Text(
                    text = " Keluar",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = "Apakah Kamu Yakin?",
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    ) {
                    Button(
                        modifier = Modifier
                            .border(
                                BorderStroke(2.dp, Color.Red),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .height(35.dp)
                            .width(140.dp),

                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Red,
                            contentColor = Color.White,
                            ),

                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text(
                            text = "Tidak",
                            style = TextStyle(fontSize = 13.sp)
                        )
                    }

                    Spacer(modifier = Modifier.width(0.dp))

                    OutlinedButton(
                        modifier = Modifier
                            .border(
                                BorderStroke(2.dp, Color.Red),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .height(35.dp)
                            .width(140.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Red,
                            ),
                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text(
                            text = "Ya",
                            style = TextStyle( fontSize = 13.sp)
                        )
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DialogAlertPreview() {
    JetpackComposeBluelakeTheme {
        DialogAlert()

    }
}