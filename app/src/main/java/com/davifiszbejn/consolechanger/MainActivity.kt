package com.davifiszbejn.consolechanger

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davifiszbejn.consolechanger.ui.theme.ConsoleChangerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ConsoleChangerTheme {
                ConsoleChangerScreen()
            }
        }
    }
}

@Composable
fun ConsoleChangerScreen(modifier: Modifier = Modifier) {
    val consoles = listOf(
        Console("Playstation 1", R.drawable.sony_playstation, "Geração 5", "1994", "Sony"),
        Console("Playstation 2", R.drawable.sony_playstation_2, "Geração 6", "2000", "Sony"),
        Console("Playstation 3", R.drawable.sony_playstation_3, "Geração 7", "2006", "Sony"),
        Console("Playstation 4", R.drawable.sony_playstation_4, "Geração 8", "2013", "Sony"),
        Console("Psp", R.drawable.sony_psp, "Geração 7", "2004", "Sony"),
        Console("Psp Vita", R.drawable.sony_psp_vita, "Geração 8", "2011", "Sony")
    )

    var consoleSelected by remember { mutableStateOf(consoles.first()) }

    var currentConsoleIndex by remember { mutableStateOf(0) }

    fun changeConsole() {
        currentConsoleIndex = (currentConsoleIndex + 1) % consoles.size
        consoleSelected = consoles[currentConsoleIndex]
    }



    Scaffold() { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(8.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ConsoleLogo()
            Spacer(modifier = Modifier.weight(1f))
            ConsoleCard(consoleSelected)
            Spacer(modifier = Modifier.weight(1f))
            ConsoleChangeButton({changeConsole()})
        }
    }

}

@Preview
@Composable
private fun ConsoleChangerScreenPreview() {
    ConsoleChangerScreen()
}