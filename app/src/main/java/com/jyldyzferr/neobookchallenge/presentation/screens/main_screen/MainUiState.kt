package com.jyldyzferr.neobookchallenge.presentation.screens.main_screen

import com.jyldyzferr.neobookchallenge.domain.models.EcoMarketResponseItemDomain

sealed interface MainUiState {
    object Loading : MainUiState
    data class Loaded(
        val productCategoryList: List<EcoMarketResponseItemDomain>,
        ) : MainUiState

    data class Error(
        val massage: String
    ) : MainUiState
}