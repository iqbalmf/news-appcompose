package net.iqbalfauzan.newsapp.util

import androidx.annotation.DrawableRes
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import net.iqbalfauzan.news_app.R

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.newsapp.util
 */
sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String,
) {
    object First: OnBoardingPage(
        image = R.drawable.onboarding1,
        title = "Meeting",
        description = generateLoremIpsum(20)
    )

    object Second: OnBoardingPage(
        image = R.drawable.onboarding2,
        title = "Coordination",
        description = generateLoremIpsum(20)
    )

    object Third: OnBoardingPage(
        image = R.drawable.onboarding3,
        title = "Dialogue",
        description = generateLoremIpsum(20)
    )
}
private fun generateLoremIpsum(wordsCount: Int): String {
    val loremWords = listOf(
        "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit",
        "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua"
    )

    val loremText = StringBuilder()
    repeat(wordsCount) {
        val randomWord = loremWords.random()
        loremText.append("$randomWord ")
    }

    return loremText.toString().trim()
}


