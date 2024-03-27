package com.example.jackpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jackpackcompose.ui.theme.JackPackComposeTheme

class Absensi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JackPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    layar("nova")
                }
            }
        }
    }
}

@Composable
fun layar(name: String, modifier: Modifier = Modifier) {

    Column {
        Row(
            modifier = Modifier
                .fillMaxSize()

        ){
            Button(
                onClick ={ /*TODO*/ },
                shape = RoundedCornerShape(
                    topStart = 5.dp,
                    topEnd = 5.dp,
                    bottomEnd = 5.dp,
                    bottomStart = 5.dp
                ),
                modifier = Modifier
                    .width(200.dp)
                    .heightIn(30.dp),

            ) {
                Text(text = "Absensi")
            }

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(
                    topStart = 5.dp,
                    topEnd = 5.dp,
                    bottomEnd = 5.dp,
                    bottomStart = 5.dp
                ),
                modifier = Modifier
                    .width(200.dp)
                    .heightIn(30.dp)
            ) {
                Text(text = "Cuti")
            }
        }
    }

}

@Composable
fun Banner(bannerPhoto : Int){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id =  bannerPhoto)
            , contentDescription = "image"
            , modifier = Modifier.width(300.dp)
        )
        Text(text = "Ups...", fontWeight = FontWeight.Bold,)
        Text(text = "saat ini tidak ada data absensi")
    }
}
@Composable
fun Banner1(bannerPhoto : Int){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id =  bannerPhoto)
            , contentDescription = "image"
            , modifier = Modifier.width(300.dp)
        )
        Text(text = "Hum...", fontWeight = FontWeight.Bold,)
        Text(text = "saat ini tidak ada data pengajuan persetujuan")

    }
}
@Composable
fun OpacityText(
    text: String,
    initialAlpha: Float,
    targetAlpha: Float,
    durationMillis: Int
){}
@Composable
fun Banner2(bannerPhoto : Int){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id =  bannerPhoto)
            , contentDescription = "image"
            , modifier = Modifier.width(300.dp)
        )
        Text(text = "Tunggu Sebentar Ya..!", fontWeight = FontWeight.Bold,)
        Text(text = "Sedang mengambil Data")
    }
}

@Preview(showBackground = true)
@Composable
fun BannerAbsenKosongPreview() {
    JackPackComposeTheme {
        Banner(R.drawable.gani)
    }
}

@Preview(showBackground = true)
@Composable
fun BannerJadwalPreview() {
    JackPackComposeTheme {
        Banner1(R.drawable.absenjadwal)
    }
}

@Preview(showBackground = true)
@Composable
fun BannerAbsenGpsPreview() {
    JackPackComposeTheme {
        Banner2(R.drawable.gps)
    }
}