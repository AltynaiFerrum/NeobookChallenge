package com.jyldyzferr.neobookchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.jyldyzferr.neobookchallenge.presentation.MyEcoMarketApp
import com.jyldyzferr.neobookchallenge.presentation.screens.main_screen.MainScreen
import com.jyldyzferr.neobookchallenge.presentation.screens.main_screen.MainScreenViewModel
import com.jyldyzferr.neobookchallenge.ui.theme.NeobookChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeobookChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyEcoMarketApp()
//                    val viewModel: MainScreenViewModel = hiltViewModel()
//                    MainScreen(
//                        modifier = Modifier,
//                        uiStateFlow = viewModel.uiStateFlow,
//                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NeobookChallengeTheme {
        Greeting("Android")
    }
}