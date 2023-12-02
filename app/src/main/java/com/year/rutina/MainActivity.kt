package com.year.rutina

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
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
    val context = LocalContext.current
    RutinaTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background //color de fondo
        ) {
            Box(Modifier.fillMaxSize()) {
                Column(Modifier.fillMaxSize()) {
                    BoxWeek(
                        day = "Lunes",
                        day2 = "Martes",
                        color = Color.Green,
                        color2 = Color.Red,
                        onClick = { Toast.makeText(context, "Lunes", Toast.LENGTH_SHORT).show()},
                        onClick2 = { Toast.makeText(context, "Martes", Toast.LENGTH_SHORT).show()}


                    )
                    BoxWeek(
                        day = "Miercoles",
                        day2 = "Jueves",
                        color = Color.Magenta,
                        color2 = Color.Gray,
                        onClick = { Toast.makeText(context, "Miercoles", Toast.LENGTH_SHORT).show()},
                        onClick2 = { Toast.makeText(context, "Jueves", Toast.LENGTH_SHORT).show()}


                    )
                    BoxWeek(
                        day = "Viernes",
                        day2 = "Sábado",
                        color = Color.DarkGray,
                        color2 = Color.Red,
                        onClick = {Toast.makeText(context, "Viernes", Toast.LENGTH_SHORT).show()},
                        onClick2 = {Toast.makeText(context, "Sábado", Toast.LENGTH_SHORT).show()}
                    )
                    Box (
                        Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(Color.Magenta)
                            .clickable { Toast.makeText(context, "Domingo", Toast.LENGTH_SHORT).show() },
                        Alignment.Center
                    ){
                        Text(text = "Domingo")
                    }
                }
            }
        }
    }
}
