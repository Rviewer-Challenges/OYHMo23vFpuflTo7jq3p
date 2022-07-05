package com.moure.challenges.twitterclone.model

import androidx.annotation.DrawableRes
import com.moure.challenges.twitterclone.R
import java.util.*
import kotlin.random.Random

data class Tweet(
    @DrawableRes val profileImage: Int,
    val fullName: String,
    val isVerifiedAccount: Boolean,
    val username: String,
    val tweetSendDate: Date,
    val tweetMessage: String,
    val hashtags: List<String>,
    val numComments: Int,
    val numRetweets: Int,
    val numLikes: Int,
    val tweetImages: List<String>? = listOf(),
    val tweetGif: String? = null
) {
    companion object {

        val MOCK_TWEETS = listOf(
            Tweet(
                profileImage = R.drawable.ic_twitter_logo,
                fullName = "Peter Parker",
                isVerifiedAccount = Random.nextInt(10) % 2 == 0,
                username = "@spiderman",
                tweetSendDate = Calendar.getInstance().apply { set(2022, 5, 20, 1, 30, 0) }.time,
                tweetMessage = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                hashtags = listOf("#superheroe"),
                numComments = Random.nextInt(10000),
                numRetweets = Random.nextInt(10000),
                numLikes = Random.nextInt(10000),
                tweetImages = listOf(),
                tweetGif = null,
            ),
        )
    }
}
