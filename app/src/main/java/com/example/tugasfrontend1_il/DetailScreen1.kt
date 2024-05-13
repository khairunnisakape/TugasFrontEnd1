package com.example.tugasfrontend1_il

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugasfrontend1_il.data.IsianList.manhwaLocalList
import com.example.tugasfrontend1_il.data.ManhwaLocal
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.tugasfrontend1_il.data.IsianList


@Composable
fun DetailScreen1(
    modifier : Modifier = Modifier,
    navController: NavController,
    ManhwaLocalId : Int?
)
{
    val newListManhwaLocal = IsianList.manhwaLocalList.filter { manhwaLocal ->
        manhwaLocal.id == ManhwaLocalId
    }
    Column(
        modifier = Modifier
    ) {
        DetailManhwaContent(newListManhwaLocal = newListManhwaLocal, navController = navController )
    }
}

@Composable
fun DetailManhwaContent(
    newListManhwaLocal: List<ManhwaLocal>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        if (newListManhwaLocal.isNotEmpty()) {
            topAppback(
                text = newListManhwaLocal.first().judul,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newListManhwaLocal.forEach { manhwaLocal ->
                    Column(
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = manhwaLocal.foto),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .width(300.dp)
                                .height(200.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Nama : ${manhwaLocal.judul}")
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Deskripsi : ${manhwaLocal.desc}")
                    }
                }
            }
        } else {
            Text(text = "sry Manhwa tersebut belum tersedia", modifier = Modifier.fillMaxWidth().padding(16.dp))
        }
    }
}