package com.jyldyzferr.neobookchallenge.presentation.screens.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.jyldyzferr.neobookchallenge.domain.models.EcoMarketResponseItemDomain
import com.jyldyzferr.neobookchallenge.ui.theme.MyGreen
import com.jyldyzferr.neobookchallenge.ui.theme.Purple80
import kotlinx.coroutines.flow.StateFlow


@Composable
fun MainScreen(
    uiStateFlow: StateFlow<MainUiState>,
    modifier: Modifier
  ){

    when (val uiState = uiStateFlow.collectAsStateWithLifecycle().value) {
        is MainUiState.Loading -> LoadingMainScreen(
        )

        is MainUiState.Loaded -> LoadedMainScreen(
            uiState = uiState,
            modifier = modifier
        )

        is MainUiState.Error -> ErrorMainScreen(
        )
    }
}



@Composable
fun LoadingMainScreen(
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(MyGreen)
    ) {
        Box(
            modifier
                .fillMaxSize()
                .alpha(0.5f)
        )
    }
}


@Composable
fun ErrorMainScreen(
    modifier: Modifier = Modifier,
) {
    Text(text = "Error")
}


@Composable
fun LoadedMainScreen(
    uiState: MainUiState.Loaded,
    modifier: Modifier = Modifier,
) {
    var nowMovies = remember { uiState.productCategoryList }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(color = Purple80)
            .padding(6.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text ="Eco-Market",
                color = Color.White,
                fontSize =  20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(10.dp)
        ){
            items(items = nowMovies){data->
                FruitDataGridItem(
                    height = 157.dp,
                    width = 112.dp,
                    data = data,
                )
            }
        }
    }
}


@Composable
fun FruitDataGridItem(
    height: Dp,
    width: Dp,
    data: EcoMarketResponseItemDomain,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .height(height = height)
            .width(width = width)
            .clip(RoundedCornerShape(30.dp))
            .border(1.dp, Color.Black, RoundedCornerShape(32.dp))
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column {
            Image(
                modifier = modifier
                    .fillMaxSize(),
                painter = rememberAsyncImagePainter(model = data.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
            )
        }
    }
}


