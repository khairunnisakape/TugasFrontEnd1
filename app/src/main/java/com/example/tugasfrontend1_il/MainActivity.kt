package com.example.tugasfrontend1_il

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugasfrontend1_il.navigations.AppNavigation
import com.example.tugasfrontend1_il.ui.theme.TugasFrontEnd1_ILTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasFrontEnd1_ILTheme {
                AppNavigation()
            }
        }
    }
}

//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun TugasApp(){
//    Scaffold (
//        content = {KontenSc1Beranda()},
//        bottomBar = { AppNavigation()}
//    )
//}

//@Preview
//@Composable
//private fun Tampilan() {
//    TugasFrontEnd1_ILTheme {
//        AppNavigation()
//    }
//}
