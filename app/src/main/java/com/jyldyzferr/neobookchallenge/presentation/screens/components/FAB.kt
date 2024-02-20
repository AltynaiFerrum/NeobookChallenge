package com.jyldyzferr.neobookchallenge.presentation.screens.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp


@Composable
fun MyFAB() {
    Scaffold(
        content = {},
        floatingActionButton = {
            FloatingActionButton(
                shape = RoundedCornerShape(
                    topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 2.dp),
                onClick = { /*TODO*/ },
                backgroundColor = Color(0xFF442c2E),
                contentColor = Color(0xFFFEDBD0)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Icon")
            }
        },
        bottomBar = { BottomNavigation(
            backgroundColor = Color(0xFFFEDBD0),
            contentColor = Color(0xFF442c2E)
        ) {}}
    )
}

@Composable
fun TestGithub(

) {
    Text(" Why you ?")
}