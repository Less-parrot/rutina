package com.year.rutina.views.Monday.Views

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.year.rutina.views.Monday.Monday
import com.year.rutina.views.Monday.Views.BeHome.ViewAnything
import com.year.rutina.views.Monday.Views.BeHome.ViewBackHome
import com.year.rutina.views.Monday.Views.BeHome.ViewDraw
import com.year.rutina.views.Monday.Views.BeHome.ViewFace
import com.year.rutina.views.Monday.Views.BeHome.ViewIce
import com.year.rutina.views.Monday.Views.BeHome.ViewLearnCook
import com.year.rutina.views.Monday.Views.BeHome.ViewLearnEnglish
import com.year.rutina.views.Monday.Views.BeHome.ViewMackingBed
import com.year.rutina.views.Monday.Views.BeHome.ViewOccupation
import com.year.rutina.views.Monday.Views.BeHome.ViewOneWord
import com.year.rutina.views.Monday.Views.BeHome.ViewProgramSoftware
import com.year.rutina.views.Monday.Views.BeHome.ViewRead
import com.year.rutina.views.Monday.Views.BeHome.ViewRelax
import com.year.rutina.views.Monday.Views.BeHome.ViewRiceFromBed
import com.year.rutina.views.Monday.Views.BeHome.ViewRun
import com.year.rutina.views.Monday.Views.BeHome.ViewSleep
import com.year.rutina.views.Monday.Views.BeHome.ViewSleepFinish
import com.year.rutina.views.Monday.Views.BeHome.ViewTeeth
import com.year.rutina.views.Monday.Views.BeHome.ViewThink
import com.year.rutina.views.Monday.Views.BeHome.ViewWakeUp
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import java.util.Timer
import java.util.TimerTask
import kotlin.concurrent.schedule


/*Lista a hacer los lunes en caso de que no tenga que ir a vender arepas
* 6am -> Despertar,
*   -tender cama
*   -cambiarse
*   -(Hielo)
*
*
* 7am -> salir a correr
*   -hacer ejercicio
*   -leer 10 páginas de un libro
*   -pensar(meditar)
*   -correr de vuelta
*
* 8:30am -> Desayunar
*   -Lavarse los dientes
*   -lavarse la cara
*   -descansar
*
* 9:10am -> Levantarse de la cama
*   -hacer oficio si hay
*   -aprender algo de inglés y/o ver películas en inglés
*   -aprender una palabra en inlés
*   -aprender a cocinar
*
* 12pm -> almorzar
*   -lavarse los dientes
*   -descansar u/o dormir
*
* 2pm -> despertar
*   - Dibujar
*   - Lluvia de ideas
*
* 3pm -> Jugar
*   -hacer cualquier cosa
*
* (4pm - 10:30pm) -> Programar
*   6:30pm -> hacer oficio
*       -descansar hasta las 7:40pm
*   -aprender algo de tecnología
*   -dormir
*/



@Composable
fun NavHostControllerMondayHour() {
    //-------------------Controlador De Pantallas----------------------------
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ViewProgramSoftware") {
        composable("ViewWakeUp") { ViewWakeUp() }//despertar
        composable("ViewMackingBed") { ViewMackingBed() }//hacer la camar
        composable("ViewIce") { ViewIce() }//hielo en cara
        composable("ViewRun") { ViewRun() }//salir a correr
        composable("ViewRead") { ViewRead() }//leer un libro
        composable("ViewThink") { ViewThink() }//pensar/meditar
        composable("ViewBackHome") { ViewBackHome() }//correr de vuelta a casa
        composable("ViewTeeth") { ViewTeeth() }//lavarse los dientes
        composable("ViewFace") { ViewFace() }//lavarse la cara
        composable("ViewRelax") { ViewRelax() }//hora de descansar un pequeño rato | ¿opcional !si!no!? |
        composable("ViewRiceFromBed") { ViewRiceFromBed() }//levantarse e la púta cama y ponerse a hacer algo
        composable("ViewOccupation") { ViewOccupation() }//hora de hacer el oficio asignado que le hayan dejado.
        composable("ViewLearnEnglish") { ViewLearnEnglish() }//ya tocó aprender inglés, lo que dejó para ultimo momento
        composable("ViewOneWord") { ViewOneWord() }//al menos aprenda una sola palabra diariamente
        composable("ViewLearnCook") { ViewLearnCook() }//aprender a cocinar
        composable("ViewSleep") { ViewSleep() }//puede dormir/descanzar
        composable("ViewDraw") { ViewDraw() }//hora de ponerse creativo, ¡Dibuja YA!
        composable("ViewAnything") { ViewAnything() }//LIBERTAD!, HACER LO QUE SEA!!
        composable("ViewProgramSoftware") { ViewProgramSoftware() }
        composable("ViewSleepFinish") { ViewSleepFinish() }//Si hizo todo, tiene merecido dormir. Felicidades


    }
}


@Composable
fun ViewBeHome(
    image: Int,
    queHacer: Int,
    description: String,
    frase: Int,
    backGround: Color,
    colorFontQueHacer: Color,
    colorTime: Color,
    colorFrase: Color
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = backGround
    ) {
        Box(Modifier.fillMaxWidth(), Alignment.TopCenter) {
            Text(
                text = "Lunes",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                fontSize = 26.sp,
                modifier = Modifier.padding(top = 5.dp)
            )
        }
        Box(
            Modifier.fillMaxSize(), Alignment.TopCenter
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = description,
                modifier = Modifier
                    .graphicsLayer(scaleX = 1.1F, scaleY = 0.75F)
                    .padding(top = 30.dp)
            )
        }

        Box(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.5F), Alignment.Center
        ) {
            Text(
                text = stringResource(id = frase),
                color = colorFrase,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 170.dp)
            )
        }

        Box(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.5F), Alignment.BottomCenter
        ) {
            Text(
                text = stringResource(id = queHacer),
                color = colorFontQueHacer,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                fontSize = 32.sp,
                modifier = Modifier.padding(bottom = 170.dp)
            )
        }

        Box(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.5F), Alignment.BottomCenter
        ) {
            Text(
                text = (GetDateTime()),
                color = colorTime,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp,
                modifier = Modifier.padding(bottom = 60.dp)
            )
        }
    }
}


fun PlayCronometro() {
    val timer = Timer()
    val hour = "19:24:10" // Hora propuesta para realizar la acción

    val tarea = object : TimerTask() {
        override fun run() {
            val horaActual = Calendar.getInstance()
            val formatoHora = java.text.SimpleDateFormat("HH:mm:ss", Locale.getDefault())
            val horaActualStr = formatoHora.format(horaActual.time)

            if (horaActualStr == hour) {
                // Mensaje por LogCat indicando que se alcanzó la hora propuesta
                Log.d("MiCronometro", "¡Ya es la hora propuesta!")
            }
        }
    }

    // Programar la tarea para que se ejecute cada segundo (ajusta el intervalo según lo requieras)
    timer.schedule(0, 1000) {
        tarea.run()
    }
}


// Obtener la fecha y la hora actual
fun GetDateTime(): String {
    val calendario = Calendar.getInstance()
    val formatoFecha = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    val formatoHora = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

    val fechaActual = formatoFecha.format(calendario.time)
    val horaActual = formatoHora.format(calendario.time)

    return "Fecha: $fechaActual\nHora: $horaActual"
}
