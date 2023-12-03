package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewRelax() {
    ViewBeHome(
        image = R.drawable.descansar,
        queHacer = R.string.descansar,
        description = "Imagen motivadora para despertar",
        frase = R.string.frase_descansar,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}