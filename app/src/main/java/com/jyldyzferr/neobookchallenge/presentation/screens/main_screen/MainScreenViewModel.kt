package com.jyldyzferr.neobookchallenge.presentation.screens.main_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jyldyzferr.neobookchallenge.data.cloud.network.EcoMarketService
import com.jyldyzferr.neobookchallenge.domain.use_cases.FetchEcoMarketProductCategoryListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val fetchEcoMarketProductCategoryListUseCase: FetchEcoMarketProductCategoryListUseCase,
    private val ecoMarketService: EcoMarketService
) : ViewModel() {

    private val _uiStateFlow = MutableStateFlow<MainUiState>(MainUiState.Loading)
    val uiStateFlow: StateFlow<MainUiState> = _uiStateFlow.asStateFlow()

    init {
        fetchAllProductsCategory()
    }

    fun fetchAllProductsCategory() {
        val handler = CoroutineExceptionHandler { _, throwable ->
            _uiStateFlow.tryEmit(MainUiState.Error(throwable.localizedMessage ?: ""))
        }
        viewModelScope.launch(handler + Dispatchers.IO) {
            _uiStateFlow.tryEmit(MainUiState.Loading)
            val productsCategory = fetchEcoMarketProductCategoryListUseCase.fetchEcoProductCategoryList()

            viewModelScope.launch{
                val ecoService = ecoMarketService.fetchProductCategoryList().body()
            }
            val loaded = MainUiState.Loaded(
                productCategoryList = productsCategory
            )
            _uiStateFlow.tryEmit(loaded)
        }
    }
}




