package com.year.rutina.views.Monday.Views.BeHome

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.year.rutina.R
import com.year.rutina.views.Monday.Views.ViewBeHome

@Composable
fun ViewFace() {
    ViewBeHome(
        image = R.drawable.cara,
        queHacer = R.string.cara,
        description = "Imagen motivadora con relación a la cara y refrescura oh si!",
        frase = R.string.frase_cara,
        backGround = Color(0xFF14122C),
        colorFontQueHacer = Color.Red,
        colorFrase = Color.White,
        colorTime = Color.White
    )
}