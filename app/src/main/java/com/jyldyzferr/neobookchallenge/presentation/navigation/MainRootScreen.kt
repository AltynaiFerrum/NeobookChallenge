package com.jyldyzferr.neobookchallenge.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainRootScreen(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()
    Scaffold(
        modifier = modifier,
        bottomBar = {
            BottomBar(navController)
        }
    ) {innerPaddings ->
        BottomNavGraph(
            modifier = Modifier.padding(innerPaddings),
            navController = navController,
        )
    }
}
