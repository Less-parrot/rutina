package com.year.rutina.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxWeek(
    day: String,
    day2: String,
    color: Color,
    color2: Color,
    onClick: () -> Unit,
    onClick2: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .height(200.dp)
                .background(color)
                .clickable { onClick() },
            Alignment.Center

        ) {
            Text(text = day)
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .height(200.dp)
                .background(color2)
                .clickable { onClick2() },
            Alignment.Center

        ) {
            Text(text = day2)
        }
    }
}
