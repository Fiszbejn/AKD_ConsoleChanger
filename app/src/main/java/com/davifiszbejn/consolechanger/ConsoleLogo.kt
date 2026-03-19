package com.davifiszbejn.consolechanger

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ConsoleLogo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(color = Color.White)
            .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(48.dp))
            .padding(horizontal = 54.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center

    ) {
        Text(
            text = "Playstation 1",
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = FontFamily(Font(R.font.playstation_font))
            )
        )
    }
}

@Preview
@Composable
private fun ConsoleLogoPreview() {
    ConsoleLogo()
}