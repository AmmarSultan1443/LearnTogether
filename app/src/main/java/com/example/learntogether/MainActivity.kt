package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(stringResource(id = R.string.head), stringResource(id = R.string.first_paragraph),
                        stringResource(id = R.string.second_paragraph))
                }
            }
        }
    }
}

@Composable
fun GreetingText(head: String,firstParagraph: String, secondParagraph: String,
                 modifier: Modifier = Modifier) {
   // The title
    Text(
        text = head,
        modifier = modifier.padding(16.dp)
    )

    Text(
        text = firstParagraph,
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )

    Text(
        text = secondParagraph,
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun GreetingImage(head: String, firstParagraph: String, secondParagraph: String,
                  modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        androidx.compose.foundation.Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth)

        GreetingText(head = head, firstParagraph = firstParagraph, secondParagraph = secondParagraph)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        GreetingImage(stringResource(id = R.string.head), stringResource(id = R.string.first_paragraph),
            stringResource(id = R.string.second_paragraph))


    }
}