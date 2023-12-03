package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewRun() {
    ViewBeHome(
        image = R.drawable.correr,
        queHacer = R.string.correr,
        description = "Imagen motivadora para ponerse hielo en la cara",
        frase = R.string.frase_correr,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}