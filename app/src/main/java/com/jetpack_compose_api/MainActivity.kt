package com.jetpack_compose_api

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           //setUsername()
          //  setPhoto()
           // setProfileData()
           // setExtraInfo()

            ProfileScreen()
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

@Composable
fun ProfileScreen() {
    /*  Column {
        Image(
            painterResource(id = R.mipmap.ic_photo_foreground),
            contentDescription = "profile pic"
        )
        Text("Laura Oliveira")
        Text("@Laura-Oliveira")
        Text("Mobile Developer | Android | iOS | Java | Kotlin | SwiftUI")
    }
*/
    Column {


        val boxHeight = remember {
            180.dp
        }
        val imageHeight = remember {
            boxHeight
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(R.color.purple_500), shape = RoundedCornerShape(
                        bottomStart = 16.dp,
                        bottomEnd = 16.dp
                    )
                )
                .height(boxHeight)
        ) {
            Image(
                painterResource(id = R.drawable.profile),
                contentDescription = "profile pic",
                modifier = Modifier
                    .offset(y = imageHeight / 2)
                    .size(imageHeight)
                    .align(Alignment.BottomCenter)
                    .clip(CircleShape),
            )
        }
        Spacer(modifier = Modifier.height(imageHeight / 2))
        Column(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Laura Oliveira",
                fontSize = 32.sp
            )
            Text(
                "@Laura-Oliveira",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Text(
            "Mobile Developer | Android | iOS | Java | Kotlin | SwiftUI",
            Modifier
                .padding(
                    start = 8.dp,
                    bottom = 8.dp,
                    end = 8.dp
                )
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}



