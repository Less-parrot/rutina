package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome


@Composable
fun ViewAnything() {
    ViewBeHome(
        image = R.drawable.hacercualquiercosa,
        queHacer = R.string.cualquierCosa,
        description = "Imagen motivadora para despertar",
        frase = R.string.frase_cualquierCosa,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}