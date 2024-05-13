package com.example.tugasfrontend1_il.navigations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItem(
        label = "Beranda",
        icon = Icons.Default.Home,
        route = "beranda"
    ),
    NavItem(
        label = "Detail",
        icon = Icons.Default.Menu,
        route = "detail"
    ),
    NavItem(
        label = "Profil",
        icon = Icons.Default.Person,
        route = "profil"
    )
)

