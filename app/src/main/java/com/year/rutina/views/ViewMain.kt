package com.year.rutina.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BoxWeek(day: String, day2: String, color: Color) {
    Row {
        Box(Modifier.fillMaxWidth(0.5f)) {
            Surface(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f),
                color = color)
            {
                Text(text = day)
            }
        }

        Box(Modifier.fillMaxWidth()) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3F),
                color = color
            ) {
                Text(text = day2)
            }

        }
    }
}