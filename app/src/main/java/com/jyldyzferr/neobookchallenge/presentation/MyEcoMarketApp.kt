package com.jyldyzferr.neobookchallenge.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.jyldyzferr.neobookchallenge.presentation.navigation.AppNavGraph

@Composable
fun MyEcoMarketApp(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    AppNavGraph(
        navHostController = navController,
    )
}