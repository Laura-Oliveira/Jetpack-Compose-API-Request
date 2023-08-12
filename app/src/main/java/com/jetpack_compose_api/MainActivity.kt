package com.jetpack_compose_api

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           //setUsername()
          //  setPhoto()
            setProfileData()
           // setExtraInfo()
        }
    }
}

@Composable
fun setUsername()
{
    Text(
        text = "Laura Oliveira",
        textAlign = TextAlign.Center, // make text center horizontal
        fontSize = 35.sp,
        fontFamily = FontFamily.SansSerif,
    )
}

@Composable
fun setPhoto()
{   
    Image(
        painterResource(id = R.mipmap.ic_photo_round),
        contentDescription = "Contact profile picture",
    )
}

@Composable
fun setProfileData() {
    Row {
        Image(
            painterResource(id = R.mipmap.ic_photo_foreground),
            contentDescription = "Contact profile picture",
        )

        Column {
            Text(
                text = "Laura Oliveira",
                textAlign = TextAlign.Center, // make text center horizontal
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
            )

            Text(
                text = "@Laura-Oliveira",
                textAlign = TextAlign.Center, // make text center horizontal
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
            )

            Text(
                text = "Mobile Developer | Android | iOS | Java | Kotlin | SwiftUI",
                textAlign = TextAlign.Center, // make text center horizontal
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
            )
        }
    }
}


@Composable
fun setExtraInfo()
{
    Row{
        Text(
            text = "@Laura-Oliveira",
            textAlign = TextAlign.Center, // make text center horizontal
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif,
        )

            Text(
                text = "Mobile Developer | Android | iOS | Java | Kotlin | SwiftUI",
                textAlign = TextAlign.Center, // make text center horizontal
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
            )
    }
}



