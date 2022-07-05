package com.moure.challenges.twitterclone.screen

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Output
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moure.challenges.twitterclone.model.Tweet
import com.moure.challenges.twitterclone.ui.theme.TwitterCloneTheme

@Composable
fun Interaction(tweet: Tweet, modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row {
            IconButton(onClick = { }) {
                Icon(Icons.Default.ChatBubbleOutline, contentDescription = null)
            }
            Text(
                tweet.numComments.toString(),
                modifier = modifier
                    .padding(start = 0.dp)
                    .align(Alignment.CenterVertically)
            )
        }

        Row {
            IconButton(onClick = { }, modifier = modifier.rotate(90f)) {
                Icon(Icons.Default.Repeat, contentDescription = null)
            }
            Text(
                tweet.numRetweets.toString(),
                modifier = modifier.align(Alignment.CenterVertically),
                textAlign = TextAlign.Start
            )
        }

        Row {
            IconButton(onClick = { }) {
                Icon(Icons.Default.FavoriteBorder, contentDescription = null)
            }

            Text(
                tweet.numLikes.toString(),
                modifier = modifier.align(Alignment.CenterVertically),
                textAlign = TextAlign.Start
            )
        }

        IconButton(
            onClick = { }, modifier = modifier.rotate(270f)
        ) {
            Icon(Icons.Default.Output, contentDescription = null)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultInteractionPreview() {
    TwitterCloneTheme {
        Interaction(Tweet.MOCK_TWEETS.first())
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DefaultNightInteractionPreview() {
    TwitterCloneTheme(darkTheme = true) {
        Interaction(Tweet.MOCK_TWEETS.first())
    }
}
