package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewOccupation() {
    ViewBeHome(
        image = R.drawable.haceroficio,
        queHacer = R.string.hacerOficio,
        description = "Hora de ayudar en la casa a hacer algo, si es que no ha logrado hacer algo en esto.",
        frase = R.string.frase_hacerOficio,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}