package com.moure.challenges.twitterclone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moure.challenges.twitterclone.model.Tweet.Companion.MOCK_TWEETS
import com.moure.challenges.twitterclone.screen.Feed
import com.moure.challenges.twitterclone.ui.theme.TwitterCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TwitterCloneApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TwitterCloneApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painterResource(R.drawable.ic_twitter_logo),
                            contentDescription = "Twitter Logo",
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        )
                    }
                },
                navigationIcon = {
                    Image(
                        painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = "",
                    )
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.AutoAwesome, "")
                    }
                },
                backgroundColor = Color.White,
                contentColor = Color.Black,
                elevation = 12.dp
            )
        }, content = {
            Feed(MOCK_TWEETS) // TODO: set the hardcoded list of tweets here
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TwitterCloneTheme {
        TwitterCloneApp()
    }
}