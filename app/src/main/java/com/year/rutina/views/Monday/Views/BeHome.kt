package com.year.rutina.views.Monday.Views

import android.graphics.Paint.Align
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.year.rutina.R
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
