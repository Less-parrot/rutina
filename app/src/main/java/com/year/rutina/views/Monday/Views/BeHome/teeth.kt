package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewTeeth() {
    ViewBeHome(
        image = R.drawable.dientes,
        queHacer = R.string.dientes,
        description = "Imagen motivadora para lavarse los dientes con toda la motivación del mundo y de las personas que lo rodean XD",
        frase = R.string.frase_dientes,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}