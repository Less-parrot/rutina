package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewThink() {
    ViewBeHome(
        image = R.drawable.pensar,
        queHacer = R.string.pensar,
        description = "Imagen motivadora para pensar y/o meditar todos los días sin desesperaciñon de lo que esté pasando.",
        frase = R.string.frase_pensar,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}