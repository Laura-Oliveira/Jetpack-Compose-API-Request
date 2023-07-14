package com.jetpack_compose_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Hello, Jetpack Compose!")
        }
    }
}

@Composable
fun Greeting(name:String)
{
    Text(
        text = name,
        textAlign = TextAlign.Center, // make text center horizontal
        fontSize = 35.sp,
        fontFamily = FontFamily.SansSerif,

    )
}


