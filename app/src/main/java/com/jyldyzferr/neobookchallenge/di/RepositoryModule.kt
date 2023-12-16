package com.jyldyzferr.neobookchallenge.di

import com.jyldyzferr.neobookchallenge.data.repository.EcoMarketRepositoryImpl
import com.jyldyzferr.neobookchallenge.domain.repository.EcoMarketRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindEcoMarketRepository(
        implement: EcoMarketRepositoryImpl
    ): EcoMarketRepository
}