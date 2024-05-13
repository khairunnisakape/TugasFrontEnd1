package com.example.tugasfrontend1_il.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasfrontend1_il.R

// DATA DIRI

@Composable
fun Screen3(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.aku),
                contentDescription = "Ini fotoku",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(250.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(16.dp))))
            Text(text = "Hidup kadang-kadang kidding, tapi pertolongan Allah tiada tanding.",
                style = typography.labelLarge, textAlign = TextAlign.Center)
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ){
                Text(text = "Nama : Khairunnisa Karima",
                    fontStyle = FontStyle.Normal, fontSize = 14.sp,
                    textAlign = TextAlign.Start)
                Text(text = "Email : khairunnisakp153@gmail.com",
                    fontStyle = FontStyle.Normal, fontSize = 14.sp,
                    textAlign = TextAlign.Start)
                Text(text = "Univ : UPN \"Veteran\" Yogyakarta",
                    fontStyle = FontStyle.Normal, fontSize = 14.sp,
                    textAlign = TextAlign.Start)
                Text(text = "Jurusan : Informatika",
                    fontStyle = FontStyle.Normal, fontSize = 14.sp,
                    textAlign = TextAlign.Start)
                Text(text = "Source : KakaoWebtoon & Webtoon",
                    fontStyle = FontStyle.Normal, fontSize = 14.sp,
                    textAlign = TextAlign.Start, )
            }
        }
    }

}

