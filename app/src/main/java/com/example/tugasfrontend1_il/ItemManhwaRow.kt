package com.example.tugasfrontend1_il

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.tugasfrontend1_il.data.Manhwa
import com.example.tugasfrontend1_il.data.ManhwaLocal

@Composable
fun ItemManhwaRow(
    manhwaLocal: ManhwaLocal,
    modifier: Modifier = Modifier,
    onClick: (Int) -> Unit
    ) {
    Column(
        modifier = Modifier.clickable { onClick(manhwaLocal.id) },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FotoManhwaLokal(manhwaLocal = manhwaLocal)
        Text(
            text = manhwaLocal.judul,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
        Text(
            text = manhwaLocal.genre,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )
    }
}

@Composable
private fun FotoManhwaLokal(manhwaLocal: ManhwaLocal){
    Image(
        painter = painterResource(id = manhwaLocal.foto),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(100.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp))),
        alignment = Alignment.CenterStart
    )
}