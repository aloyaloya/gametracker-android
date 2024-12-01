package com.example.gametracker_android.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import com.example.gametracker_android.R

sealed class RootScreens(
    val route: String,
    val icon: Int,
    val name: String
) {
    data object Home: RootScreens("home_screen", R.drawable.ic_home_screen, "Home")
    data object Discover: RootScreens("discover_screen", R.drawable.ic_discover_screen, "Discover")
    data object Saved: RootScreens("saved_screen", R.drawable.ic_saved_screen, "Saved")
    data object Profile: RootScreens("profile_screen", R.drawable.ic_profile_screen, "Profile")
}

val RootScreensRoutes = listOf(
    RootScreens.Home,
    RootScreens.Discover,
    RootScreens.Saved,
    RootScreens.Profile
)