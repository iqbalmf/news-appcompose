package net.iqbalfauzan.newsapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.iqbalfauzan.newsapp.ui.screen.HomeScreen
import net.iqbalfauzan.newsapp.ui.screen.WelcomScreen

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.newsapp.ui.navigation
 */
@Composable
fun SetupNavGraph(navController: NavHostController, startDestination: String) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(route = Screen.Welcome.route) {
            //WelcomeScreen
            WelcomScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            //HomeScreen
            HomeScreen()
        }
    }
}