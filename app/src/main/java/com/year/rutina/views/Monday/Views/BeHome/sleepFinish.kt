package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewSleepFinish() {
    ViewBeHome(
        image = R.drawable.dormirfinal,
        queHacer = R.string.dormirFinal,
        description = "Imagen motivadora para despertar",
        frase = R.string.frase_dormirFinal,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}