package com.jyldyzferr.neobookchallenge.presentation.navigation

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jyldyzferr.neobookchallenge.presentation.screens.basket_screen.BasketScreen
import com.jyldyzferr.neobookchallenge.presentation.screens.history_screen.HistoryScreen
import com.jyldyzferr.neobookchallenge.presentation.screens.info_screen.InfoScreen
import com.jyldyzferr.neobookchallenge.presentation.screens.main_screen.MainScreen
import com.jyldyzferr.neobookchallenge.presentation.screens.main_screen.MainScreenViewModel

@Composable
fun BottomNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarNavigationDestinations.Main.route
    ) {
        composable(route = BottomBarNavigationDestinations.Main.route) {
            val viewModel: MainScreenViewModel = hiltViewModel()
            MainScreen(uiStateFlow = viewModel.uiStateFlow, modifier = modifier)
        }
        composable(route = BottomBarNavigationDestinations.Basket.route) {
            BasketScreen(
            )
        }
        composable(route = BottomBarNavigationDestinations.History.route) {
            HistoryScreen()
        }
        composable(route = BottomBarNavigationDestinations.Info.route) {
            InfoScreen()
        }
    }
}






