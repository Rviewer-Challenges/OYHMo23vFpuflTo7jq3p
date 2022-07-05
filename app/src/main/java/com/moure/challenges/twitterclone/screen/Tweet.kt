package com.moure.challenges.twitterclone.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moure.challenges.twitterclone.model.Tweet
import com.moure.challenges.twitterclone.ui.theme.TwitterCloneTheme

@Composable
fun Tweet(tweet: Tweet) {
    Row {
        // User image profile
        Image(
            painter = painterResource(tweet.profileImage),
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape),
            contentScale = ContentScale.Crop,
            contentDescription = "",
        )
        Column(modifier = Modifier.padding(horizontal = 8.dp)) {
            TweetHeader(tweet)
            Text(tweet.tweetMessage)
            Interaction(tweet)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultTextTweetPreview() {
    TwitterCloneTheme {
        Tweet(Tweet.MOCK_TWEETS.first())
    }
}
