package com.example.tugasfrontend1_il.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.tugasfrontend1_il.data.IsianList
import com.example.tugasfrontend1_il.data.Manhwa
import com.example.tugasfrontend1_il.data.ManhwaLocal
import com.example.tugasfrontend1_il.navigations.NavItem

// JADWAL UPDATE HARI INI

@Composable
fun Screen2() {
    val detail = remember { IsianList.manhwaList }
    val detailLocal = remember { IsianList.manhwaLocalList }

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(detail, key = { it.id }) {
            Image(
                painter = painterResource(id = it.foto),
                contentDescription = "Cover: " + it.judul,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(150.dp)
                    .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
                    .fillMaxWidth()
                    .wrapContentHeight()
            )
            Text(text = it.judul, textAlign = TextAlign.Center)
        }


    }
}
