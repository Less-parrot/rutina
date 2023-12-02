package com.year.rutina.views.Monday

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.year.rutina.views.Monday.Views.ViewBeHome
import com.year.rutina.views.Monday.Views.ViewGoMoney

@Composable
fun NavHostControllerMonday() {
    //-------------------Controlador De Pantallas----------------------------
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Monday") {
        composable("Monday") { Monday().Monday(navHostController = navController) }
        composable("BeHome") { ViewBeHome() }
        composable("GoMoney") { ViewGoMoney() }
    }
}

class Monday() {
    @SuppressLint("NotConstructor")
    @Composable
    fun Monday(navHostController: NavHostController) {

        Box(
            Modifier
                .fillMaxSize()
        ) {
            Column {
                GoMoney(navHostController)
                BeHome(navHostController)
            }
        }
    }

    @Composable
    fun BeHome(navHostController: NavHostController) {
        Box(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(Color.Red)
                .clickable {
                    navHostController.navigate("BeHome")
                },
            Alignment.Center

        ) {
            Text(text = "Quedarse en casa")
        }
    }

    @Composable
    fun GoMoney(navHostController: NavHostController) {
        Box(
            Modifier
                .fillMaxHeight(0.5F)
                .fillMaxWidth()
                .background(Color.DarkGray)
                .clickable {
                    navHostController.navigate("GoMoney")
                },
            Alignment.Center
        )
        {
            Text(text = "Trabajar")
        }
    }
}
