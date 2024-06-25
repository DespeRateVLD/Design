package com.example.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.ui.theme.DesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
                }
            }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp, vertical = 270.dp)
            .border(3.dp, Color.Black)) {


            Text(

                modifier = Modifier
                    .padding(bottom = 60.dp)
                    .background(Color.Magenta)
                    .width(350.dp)
                    .height(50.dp)
                    .align(Alignment.Center)
                    .wrapContentHeight(),
                text = "",
            )

            Text(
                modifier = Modifier
                    .padding(top  = 25.dp)
                    .background(Color.Red)
                    .align(Alignment.TopCenter)
                    .width(350.dp)
                    .height(50.dp)
                    .wrapContentHeight(),
                text = "",
            )
            Text(
                modifier = Modifier
                    .padding(bottom = 90.dp)
                    .background(Color.Yellow)
                    .align(Alignment.BottomCenter)
                    .width(350.dp)
                    .height(50.dp)
                    .wrapContentHeight(),
                text = "",
            )
            Button(
                onClick = {},
                shape = RectangleShape,
                modifier = Modifier
                    .padding(bottom = 25.dp)
                    .align(Alignment.BottomCenter)
                    .width(350.dp)
                    .height(50.dp)
                    .wrapContentHeight(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff004D40)
                )
            ) {
                Text("Button", fontSize = 25.sp)

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesignTheme {
        Greeting("Android")
    }
}