package com.davifiszbejn.consolechanger

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ConsoleCard(console: Console) {
    Box(
        modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
        .background(color = Color.Gray, shape = RoundedCornerShape(16.dp))
        .padding(vertical = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.background(color = Color.White, shape = RoundedCornerShape(16.dp)).padding(horizontal = 16.dp, vertical = 40.dp),
            ) {
                Image(
                    painter = painterResource(console.imagePath),
                    contentDescription = "Imagem console",
                    modifier = Modifier.width(150.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = console.nome,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(
                    text = "Geração: ",
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = console.geracao
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(
                    text = "Ano: ",
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = console.ano
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(
                    text = "Fabricante: ",
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = console.fabricante
                )
            }
        }

    }
}

@Preview
@Composable
private fun ConsoleCardPreview() {
    ConsoleCard(console = Console("Playstation 1", R.drawable.sony_playstation, "Geração 1", "1994", "Sony"))
}