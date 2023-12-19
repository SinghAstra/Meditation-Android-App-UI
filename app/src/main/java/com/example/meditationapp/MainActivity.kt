package com.example.meditationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditationapp.ui.theme.MeditationAppTheme
import com.example.meditationapp.ui.theme.carolinaBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationAppTheme {
                Box(modifier = Modifier
                    .background(color = carolinaBlue)
                    .fillMaxHeight()){
                    GreetingSection("Abhay")
                }
            }
        }
    }

    @Composable
    fun GreetingSection(name: String) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, Color.White, RectangleShape)
            .padding(16.dp),
            Arrangement.SpaceBetween){
            Column {
                Text(
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        fontSize = 19.sp
                    ),
                    text = "Good Morning, $name"
                )
                Text(
                    style = TextStyle(
                        fontFamily = FontFamily.Monospace,
                        color = Color.White,
                        fontSize = 16.sp
                    ),
                    text = "We wish you have a good day!"
                )
            }
            Image(painter = painterResource(R.drawable.magnifyingglass),
                contentDescription = "Magnifying Glass",
                colorFilter = ColorFilter.tint(color = Color.White)
            )
        }
    }
}
