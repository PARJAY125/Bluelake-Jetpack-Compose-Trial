package com.example.jetpackcomposebluelake.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposebluelake.R
import com.example.jetpackcomposebluelake.logic.BannerInfo
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

@Composable
fun Banner(bannerPhoto : Int, bannerInfo: BannerInfo){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id =  bannerPhoto)
            , contentDescription = "image"
            , modifier = Modifier.width(300.dp)
        )

        Text(
            text =
            when (bannerInfo) {
                BannerInfo.AbsenKosong -> "Ups..."
                BannerInfo.Jadwal -> "Hum..."
                else -> "Tunggu Sebentar Ya..!"
            },
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Text (
            text =
                when (bannerInfo) {
                    BannerInfo.AbsenKosong -> "saat ini tidak ada data absensi"
                    BannerInfo.Jadwal -> "saat ini tidak ada data pengajuan persetujuan"
                    else -> "Sedang mengambil Data"
                },
            )
    }
}

@Preview(showBackground = true)
@Composable
fun BannerAbsenKosongPreview() {
    JetpackComposeBluelakeTheme {
        Banner(R.drawable.absen, BannerInfo.AbsenKosong)
    }
}

@Preview(showBackground = true)
@Composable
fun BannerJadwalPreview() {
    JetpackComposeBluelakeTheme {
//        Banner(R.drawable.gps, BannerInfo.Jadwal)
    }
}

@Preview(showBackground = true)
@Composable
fun BannerAbsenGpsPreview() {
    JetpackComposeBluelakeTheme {
//        Banner(R.drawable.lokasi, BannerInfo.AbsenGps)
    }
}