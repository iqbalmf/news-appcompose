package net.iqbalfauzan.newsapp.ui.navigation

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.newsapp.ui.navigation
 */
sealed class Screen(val route: String) {
    object Welcome: Screen(route = "welcome_screen")
    object Home: Screen(route = "home_screen")
}