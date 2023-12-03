package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewRiceFromBed() {
    ViewBeHome(
        image = R.drawable.levantarsecama,
        queHacer = R.string.levantarseCama,
        description = "Hora de levantarse de esa cama, soltar ese aparato y hacer algo productivo.",
        frase = R.string.frase_levantarseCama,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}