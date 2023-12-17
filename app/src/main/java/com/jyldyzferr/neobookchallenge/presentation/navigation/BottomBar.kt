package com.jyldyzferr.neobookchallenge.presentation.navigation

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.jyldyzferr.neobookchallenge.ui.theme.MyGreen

@Composable
fun BottomBar(
    navController: NavHostController
) {
    val screens = listOf(
        BottomBarNavigationDestinations.Main,
        BottomBarNavigationDestinations.Basket,
        BottomBarNavigationDestinations.History,
        BottomBarNavigationDestinations.Info,
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = MaterialTheme.colorScheme.surface
    ) {
        screens.forEach { screen ->
            AddItem(
                modifier = Modifier.weight(1f),
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route)
                },
                icon = screen.icon
            )
        }
    }
}

private const val DEFAULT_ICON_SIZE = 56

@Composable
fun AddItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    iconSize: Dp = DEFAULT_ICON_SIZE.dp,
) {
    val scale = if (selected) 1.5f else 1.0f

    val color = if (selected) MyGreen
    else Color.Gray

    val animatedScale: Float by animateFloatAsState(
        targetValue = scale,
        animationSpec = TweenSpec(
            durationMillis = 500,
            easing = FastOutSlowInEasing
        ), label = ""
    )
    val animatedColor by animateColorAsState(
        targetValue = color,
        animationSpec = TweenSpec(
            durationMillis = 500,
            easing = FastOutSlowInEasing
        ), label = ""
    )
    IconButton(
        onClick = onClick,
        modifier = modifier.size(iconSize)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = String(),
            tint = animatedColor,
            modifier = Modifier.scale(animatedScale)
        )
    }
}
