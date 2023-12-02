package com.year.rutina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.year.rutina.ui.theme.RutinaTheme
import com.year.rutina.views.BoxWeek

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavHostController()
        }
    }
}

@Composable
fun NavHostController() {
    //-------------------Controlador De Pantallas----------------------------
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1") {
        composable("Screen1") { MainScreen() }
    }
    //-----------------------------------------------------------------------
}


@Composable
fun MainScreen() {
    RutinaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background //color de fondo
        ) {
            Box(Modifier.fillMaxSize()) {
                BoxWeek(day = "Lunes", day2 = "Martes", color = Color.Blue)
            }
        }
    }
}
