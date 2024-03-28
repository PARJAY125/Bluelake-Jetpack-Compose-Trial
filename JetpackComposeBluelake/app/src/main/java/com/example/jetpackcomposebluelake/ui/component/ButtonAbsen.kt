package com.example.jetpackcomposebluelake.ui.component

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposebluelake.R
import java.security.AllPermission
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

class ButtonAbsen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBluelakeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    selasa()
                }
            }
        }
    }
}

@Composable
fun selasa() {
    Column {
        val openDialog = remember {
            mutableStateOf(false)
        }
        OutlinedButton(
            modifier = Modifier
                .height(80.dp)
                .width(350.dp)
                .border(BorderStroke(1.dp, Color.Red), shape = RoundedCornerShape(10.dp)),
            shape = RoundedCornerShape(
                topStart = 10.dp,
                topEnd = 10.dp,
                bottomEnd = 10.dp,
                bottomStart = 10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFFFF),
                contentColor = Color.Red,
                ),
            onClick = {},
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Column{
                    Text(
                        text = "Selasa, 02 Februari 2022",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                        )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "(5 jam)",
                        color = Color.Black,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
                Row{
//                    Image(
//                        painter = painterResource(id = R.drawable.silang),
//                        contentDescription = "Silang",
//                        modifier = Modifier.size(40.dp))
//                    Image(
//                        painter = painterResource(id = R.drawable.centang),
//                        contentDescription = "centang",
//                        modifier = Modifier.size(40.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun selasaPreview() {
    JetpackComposeBluelakeTheme {
        selasa()
    }
}