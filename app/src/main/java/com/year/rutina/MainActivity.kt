package com.year.rutina

import android.os.Bundle
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.year.rutina.ui.theme.RutinaTheme
import com.year.rutina.views.BoxWeek
import com.year.rutina.views.Friday
import com.year.rutina.views.Monday.NavHostControllerMonday
import com.year.rutina.views.Monday.Views.PlayCronometro
import com.year.rutina.views.Saturday
import com.year.rutina.views.Sunday
import com.year.rutina.views.Thursday
import com.year.rutina.views.Tuesday
import com.year.rutina.views.Wednesday

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
    NavHost(navController = navController, startDestination = "MainScreen") {
        composable("MainScreen") { MainScreen(navController) }
        composable("Monday") { NavHostControllerMonday() }
        composable("Tuesday") { Tuesday() }
        composable("Wednesday") { Wednesday() }
        composable("Thursday") { Thursday() }
        composable("Friday") { Friday() }
        composable("Saturday") { Saturday() }
        composable("Sunday") { Sunday() }

    }
}


@Composable
fun MainScreen(navHostController: NavHostController) {
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
                        onClick = { navHostController.navigate("Monday") },
                        onClick2 = { navHostController.navigate("Tuesday") }
                    )

                    BoxWeek(
                        day = "Miercoles",
                        day2 = "Jueves",
                        color = Color.Magenta,
                        color2 = Color.Gray,
                        onClick = { navHostController.navigate("Wednesday") },
                        onClick2 = { navHostController.navigate("Thursday") }
                    )

                    BoxWeek(
                        day = "Viernes",
                        day2 = "Sábado",
                        color = Color.DarkGray,
                        color2 = Color.Red,
                        onClick = { navHostController.navigate("Friday") },
                        onClick2 = { navHostController.navigate("Saturday") }
                    )

                    Box (
                        Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(Color.Magenta)
                            .clickable { navHostController.navigate("Sunday") },
                        Alignment.Center
                    ){
                        Text(text = "Domingo")
                    }
                }
            }
        }
    }
    PlayCronometro()

}

@Preview(showSystemUi = true)
@Composable
fun PreviewApp() {
    NavHostController()
}