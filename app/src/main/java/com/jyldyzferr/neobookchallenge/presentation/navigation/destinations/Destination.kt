package com.jyldyzferr.neobookchallenge.presentation.navigation.destinations


interface  Destination {
    fun route(): String

    fun routeWithArgs(): String
}

object MainScreenDestination : Destination {
    override fun route(): String = "main_screen"

    override fun routeWithArgs(): String = ""
}