package com.example.gametracker_android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gametracker_android.presentation.screens.discovery_screen.DiscoverScreen
import com.example.gametracker_android.presentation.screens.home_screen.HomeScreen
import com.example.gametracker_android.presentation.screens.profile_screen.ProfileScreen
import com.example.gametracker_android.presentation.screens.saved_screen.SavedScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = RootScreens.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable("home_screen") {
            HomeScreen()
        }
        composable("discover_screen") {
            DiscoverScreen()
        }
        composable("saved_screen") {
            SavedScreen()
        }
        composable("profile_screen") {
            ProfileScreen()
        }
    }
}