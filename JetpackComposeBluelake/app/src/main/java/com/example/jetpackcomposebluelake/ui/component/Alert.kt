package com.example.jetpackcomposebluelake.ui.component

import android.app.AlertDialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
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

class Alert : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBluelakeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    button()
                }
            }
        }
    }
}

@Composable
fun button() {
    Column {


        val openDialog = remember {
            mutableStateOf(true)
        }
        OutlinedButton(
            modifier = Modifier
                .height(50.dp)
                .width(140.dp)
                .border(BorderStroke(2.dp, Color.Red), shape = RoundedCornerShape(4.dp)),
            shape = RoundedCornerShape(
                topStart = 5.dp,
                topEnd = 5.dp,
                bottomEnd = 5.dp,
                bottomStart = 5.dp
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
}
    @Composable
    fun DialogAlert(){
        val openDialog = remember {
            mutableStateOf(true)
        }


            Dialog(


                onDismissRequest = { openDialog.value = false },
                properties = DialogProperties(dismissOnClickOutside = false),
                content = {
                    Box(

                        modifier = Modifier
                            .width(320.dp)
                            .height(390.dp)
                            .background(Color.White)
                            .padding(top = 20.dp)
                        ,
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(painter = painterResource(id = R.drawable.alertimage), contentDescription = "Alert",
                                modifier = Modifier
                                    .width(200.dp) // Set the width to 200dp
                                    .height(250.dp))

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
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly,


                                ) {
                                Button(
                                    shape = RoundedCornerShape(
                                        topStart = 5.dp,
                                        topEnd = 5.dp,
                                        bottomEnd = 5.dp,
                                        bottomStart = 5.dp
                                    ),
                                    modifier = Modifier
                                        .border(
                                            BorderStroke(2.dp, Color.Red),
                                            shape = RoundedCornerShape(4.dp)
                                        )
                                        .height(35.dp)
                                        .width(140.dp),

                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.Red,
                                        contentColor = Color.White,

                                        ),
                                    onClick = {
                                        // Perform action on cancel button click
                                        openDialog.value = false
                                    }
                                ) {
                                    Text(text = "Tidak",
                                        style = TextStyle(
                                            fontSize = 13.sp
                                        )
                                    )
                                }
                                Spacer(modifier = Modifier.width(0.dp))
                                OutlinedButton(
                                    modifier = Modifier
                                        .border(
                                            BorderStroke(2.dp, Color.Red),
                                            shape = RoundedCornerShape(4.dp)
                                        )
                                        .height(35.dp)
                                        .width(140.dp),
                                    shape = RoundedCornerShape(5.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.White,
                                        contentColor = Color.Red,

                                        ),
                                    onClick = {
                                        // Perform action on confirm button click
                                        openDialog.value = false
                                    }
                                ) {
                                    Text(text = "Ya",
                                        style = TextStyle(
                                            fontSize = 13.sp
                                        ))
                                }
                            }
                        }
                    }
                }
            )
        }



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    JetpackComposeBluelakeTheme {
        button()

    }
}
@Preview(showBackground = true)
@Composable
fun DialogAlertPreview() {
    JetpackComposeBluelakeTheme {
        DialogAlert()

    }
}