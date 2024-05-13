package com.example.tugasfrontend1_il.navigations

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugasfrontend1_il.DetailScreen1
import com.example.tugasfrontend1_il.screens.Screen1
import com.example.tugasfrontend1_il.screens.Screen2
import com.example.tugasfrontend1_il.screens.Screen3

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach { navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == navItem.route } == true,
                        onClick = {
                                  navController.navigate(navItem.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                            Icon(
                                imageVector = navItem.icon,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
    ) {
        PaddingValues -> 
        NavHost(
            navController = navController,
            startDestination = "beranda",
            modifier = Modifier
                .padding(PaddingValues)
        ){
            composable(route = "beranda"){
                Screen1(navController)
            }
            composable(route = "detail"){
                Screen2()
            }
            composable(route = "profil"){
                Screen3()
            }
            composable(route = Screens.detailScreen1.name+"/{ManhwaLocalId/}", arguments = listOf(
                navArgument("ManhwaLocalId"){
                    type = NavType.IntType
                }
            )){
                navBackStackEntry -> DetailScreen1(
                navController = navController,
                ManhwaLocalId = navBackStackEntry.arguments?.getInt("ManhwaLocalId"))
            }
        }

    }
}