package com.example.tugasfrontend1_il.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugasfrontend1_il.ItemManhwaColumn
import com.example.tugasfrontend1_il.ItemManhwaRow
import com.example.tugasfrontend1_il.data.IsianList
import com.example.tugasfrontend1_il.data.ManhwaLocal
import com.example.tugasfrontend1_il.navigations.Screens

// LAZY ROW &  LAZY COLUMN
// DAFTAR MANHWA

@Composable
fun Screen1(
    navController: NavController
){
    val daftarManhwa = remember { IsianList.manhwaList }
    val daftarManhwaLokal = remember { IsianList.manhwaLocalList }

    // RIWAYAT BACA
    LazyColumn (
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ){
        // REKOMENDASI BACA
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
            ) {
                items(
                    items = daftarManhwaLokal,
                    key = {it.id},
                    itemContent = {
                        ItemManhwaRow(manhwaLocal = it){
                            ManhwaLocalId -> navController.navigate (Screens.detailScreen1.name+"/${ManhwaLocalId}")
                        }
                    }
                )
            }
        }
        items(
            items = daftarManhwa,
            key = {it.id},
            itemContent = {
                ItemManhwaColumn(manhwa = it)
            }
        )
    }
}