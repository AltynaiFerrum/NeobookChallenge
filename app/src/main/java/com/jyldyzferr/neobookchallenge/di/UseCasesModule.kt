package com.jyldyzferr.neobookchallenge.di

import com.jyldyzferr.neobookchallenge.domain.use_cases.FetchEcoMarketProductCategoryListImpl
import com.jyldyzferr.neobookchallenge.domain.use_cases.FetchEcoMarketProductCategoryListUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface UseCasesModule {
    @Binds
    fun bindFetchEcoMarketProductCategoryList(
        implement: FetchEcoMarketProductCategoryListImpl
    ): FetchEcoMarketProductCategoryListUseCase
}