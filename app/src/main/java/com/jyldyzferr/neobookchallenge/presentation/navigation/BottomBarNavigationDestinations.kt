package com.jyldyzferr.neobookchallenge.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarNavigationDestinations(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Main: BottomBarNavigationDestinations(
        route = "main",
        title = "Home",
        icon = Icons.Outlined.Home
    )
    object Basket: BottomBarNavigationDestinations(
        route = "basket",
        title = "Basket",
        icon = Icons.Outlined.ShoppingCart
    )
    object History: BottomBarNavigationDestinations(
        route = "history",
        title = "History",
        icon = Icons.Outlined.DateRange
    )
    object Info: BottomBarNavigationDestinations(
        route = "info",
        title = "Info",
        icon = Icons.Outlined.Info
    )
}