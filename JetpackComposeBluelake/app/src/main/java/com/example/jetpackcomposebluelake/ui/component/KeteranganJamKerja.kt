package com.example.jetpackcomposebluelake.ui.component

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposebluelake.R
import com.example.jetpackcomposebluelake.logic.BannerInfo
import com.example.jetpackcomposebluelake.logic.KeteranganjadwalPegawai
import com.example.jetpackcomposebluelake.ui.theme.JetpackComposeBluelakeTheme

//@Composable
//fun KeteranganJamKerja () {
//    val actualDataJadwalPegawai = arrayListOf("masuk", "jam kerja", "istirahat", "pulang")
//
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .border(BorderStroke(1.dp, Color.Red), shape = RoundedCornerShape(10.dp))
//            .padding(16.dp)
//    ) {
//
//
//        Column(
//            modifier = Modifier.weight(1f),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Row (verticalAlignment = Alignment.CenterVertically) {
//                Image( // Replace with the desired icon resource
//                    painter = painterResource(id =  R.drawable.time_circle_svg),
//                    contentDescription = "Jam Kerja",
//                )
//                Spacer(modifier = Modifier.width(8.dp)) // Adjust spacing as needed
//                Text(text = "Jam Kerja")
//            }
//
//            Text(text = "--:--:--")
//        }
//    }
//}


@Composable
fun KeteranganJamKerja() {

    val actualDataJadwalPegawai = KeteranganjadwalPegawai.values().toList() // Use enum values directly

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(BorderStroke(1.dp, Color.Red), shape = RoundedCornerShape(10.dp))
            .padding(16.dp)
    ) {
        actualDataJadwalPegawai.forEach { keterangan ->
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Get icon based on enum value (modify as needed)
                    val iconId = when (keterangan) {
                        KeteranganjadwalPegawai.masuk -> R.drawable.time_circle_svg
                        KeteranganjadwalPegawai.jam_kerja -> R.drawable.time_circle_svg
                        KeteranganjadwalPegawai.istirahat -> R.drawable.time_circle_svg
                        KeteranganjadwalPegawai.pulang -> R.drawable.time_circle_svg
                    }
                    Image(
                        painter = painterResource(id = iconId),
                        contentDescription = keterangan.name, // Use enum name for description
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = keterangan.name,
                        fontSize = 14.sp
                    )
                }
                // Replace with actual data for time
                Text(text = "--:--:--")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KeteranganJamKerjaPreview() {
    JetpackComposeBluelakeTheme {
        KeteranganJamKerja()
    }
}