package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewMackingBed() {
    ViewBeHome(
        image = R.drawable.tendercama,
        queHacer = R.string.tenderCama,
        description = "Imagen motivadora para tender la cama todos los días",
        frase = R.string.frase_tenderCama,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}