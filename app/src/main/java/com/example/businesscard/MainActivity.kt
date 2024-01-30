package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFDCEC3)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard( modifier: Modifier = Modifier) {
    val fullName = "Braulio Castelblanco"
    val profession = "Software Developer"
    val profileImage = painterResource(id = R.drawable.cartoon)
    val mailImage = painterResource(id = R.drawable.mail)
    val phoneImage = painterResource(id = R.drawable.phone)
    val socialImage = painterResource(id = R.drawable.rocket)
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                Modifier.size(150.dp)
                    .background(Color(0xFF0A2E48))
            ){
            Image(
                painter = profileImage,
                contentDescription = null,

                )}
            Text(
                text = fullName,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
            Text(
                text = profession,
                fontSize = 19.sp
            )
        }
        Column (
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(30.dp)
        ){
            Row(
                modifier = Modifier.padding(10.dp)
            )
            {
                Image(
                    painter = phoneImage,
                    contentDescription = null
                )
                Text(
                    text = "  +1 403-471-****",
                    fontSize = 14.sp
                )
            }
            Row(
                modifier = Modifier.padding(10.dp)
            )
            {
                Image(
                    painter = socialImage,
                    contentDescription = null
                )
                Text(
                    text = "  brauCastelblanco",
                    fontSize = 14.sp
                )

            }
            Row(
                modifier = Modifier.padding(10.dp)
            ){
                Image(
                    painter = mailImage,
                    contentDescription = null
                )
                Text(
                    text = "  braulioacc@gmail.com",
                    fontSize = 14.sp
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}