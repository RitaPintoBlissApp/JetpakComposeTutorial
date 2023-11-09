package com.example.jetpakcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpakcomposetutorial.ui.theme.JetpakComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpakComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialScreen(text1 = getString(R.string.tutorial), text2 = getString(R.string.text2) , text3 = getString(R.string.text3) )
                 }
                }
            }
        }
    }

@Composable
fun TutorialScreen( text1: String,text2: String,text3: String,modifier: Modifier = Modifier){
    Column{
        TutorialImage()
        TutorialText(text1 = text1, text2 =text2 , text3 = text3 )
    }
}

@Composable
fun TutorialImage( modifier: Modifier = Modifier){
    Image(
        painter = painterResource(R.drawable.bg_compose_background),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = modifier
            .fillMaxWidth()
    )
}

@Composable
fun TutorialText(text1: String,text2: String,text3: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(1.dp)
      ) {
        Text(
            text = text1,
            fontSize = 24.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = text2,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        )
        Text(
            text = text3,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialPreview() {
    JetpakComposeTutorialTheme {
        TutorialScreen(text1 = "HAHA", text2 = "TESTE" , text3 = "LARAA" )
    }
}