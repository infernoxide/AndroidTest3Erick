package com.example.androidtest3.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidtest3.presentation.screens.HomeCharacters

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Home.nameFlow
    ) {
        composable(ScreenRoutes.Home.nameFlow) {
            HomeCharacters()
        }
    }
}