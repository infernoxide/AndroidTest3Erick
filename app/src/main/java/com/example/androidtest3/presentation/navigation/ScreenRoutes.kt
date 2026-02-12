package com.example.androidtest3.presentation.navigation

sealed class ScreenRoutes: NameRoutes {
    object Home: ScreenRoutes(){
        override val nameFlow: String = "Home"
    }
}

interface NameRoutes{
    val nameFlow: String
}