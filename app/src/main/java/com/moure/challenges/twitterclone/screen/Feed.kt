package com.moure.challenges.twitterclone.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moure.challenges.twitterclone.model.Tweet
import com.moure.challenges.twitterclone.model.Tweet.Companion.MOCK_TWEETS
import com.moure.challenges.twitterclone.ui.theme.TwitterCloneTheme

@Composable
fun Feed(tweets: List<Tweet>) {

    LazyColumn(
        modifier = Modifier
            .padding(vertical = 4.dp)
            .fillMaxWidth()
    ) {
        items(items = tweets) { tweet ->

            Card(modifier = Modifier.fillMaxWidth()) {
                Tweet(tweet)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultFeedPreview() {
    TwitterCloneTheme {
        Feed(MOCK_TWEETS)
    }
}

