package com.moure.challenges.twitterclone.screen

import android.text.format.DateUtils
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moure.challenges.twitterclone.model.Tweet
import com.moure.challenges.twitterclone.ui.theme.TwitterCloneTheme
import java.util.*

@Composable
fun TweetHeader(tweet: Tweet) {

    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = tweet.fullName,
            modifier = Modifier.align(Alignment.CenterVertically),
            fontWeight = FontWeight.Bold
        )

        Icon(
            Icons.Filled.Check,
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .wrapContentHeight(),
            contentDescription = "",
            tint = Color.Green
        )

        Text(
            text = tweet.username,
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .align(Alignment.CenterVertically),
            fontSize = 10.sp
        )
        Text(
            text = DateUtils.getRelativeTimeSpanString(
                tweet.tweetSendDate.time,
                Calendar.getInstance().time.time,
                DateUtils.MINUTE_IN_MILLIS,
                DateUtils.FORMAT_ABBREV_RELATIVE
            ).toString(),
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .align(Alignment.CenterVertically),
            fontSize = 9.sp
        )

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            Icon(
                Icons.Filled.MoreHoriz,

                contentDescription = ""
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultTweetHeaderPreview() {
    TwitterCloneTheme {
        TweetHeader(Tweet.MOCK_TWEETS.first())
    }
}
