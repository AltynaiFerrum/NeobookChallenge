package com.jyldyzferr.neobookchallenge.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jyldyzferr.neobookchallenge.presentation.navigation.destinations.MainScreenDestination

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
) {
    NavHost(
        navController = navHostController,
        startDestination = MainScreenDestination.route()
    ) {
        composable(
            route = MainScreenDestination.route())
        {
            MainRootScreen()
        }
    }
}



