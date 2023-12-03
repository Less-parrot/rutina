package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewIce() {
    ViewBeHome(
        image = R.drawable.hielo,
        queHacer = R.string.hielo,
        description = "Imagen motivadora para ponerse hielo en la cara",
        frase = R.string.frase_hielo,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}