package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewProgramSoftware() {
    ViewBeHome(
        image = R.drawable.programar,
        queHacer = R.string.programar,
        description = "Imagen motivadora para despertar",
        frase = R.string.frase_programar,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}