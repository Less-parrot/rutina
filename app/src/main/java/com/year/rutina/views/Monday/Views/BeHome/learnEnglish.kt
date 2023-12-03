package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewLearnEnglish() {
    ViewBeHome(
        image = R.drawable.ingles,
        queHacer = R.string.ingles,
        description = "Imagen motivadora para despertar",
        frase = R.string.frase_ingles,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}