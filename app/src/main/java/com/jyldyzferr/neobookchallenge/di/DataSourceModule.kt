package com.jyldyzferr.neobookchallenge.di

import com.jyldyzferr.neobookchallenge.data.cloud.network.EcoMarketService
import com.jyldyzferr.neobookchallenge.data.cloud.sourse.EcoMarketCloudDataSource
import com.jyldyzferr.neobookchallenge.data.cloud.sourse.EcoMarketCloudDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    fun provideEcoMarketCloudDataSource(
        ecoMarketService: EcoMarketService
    ): EcoMarketCloudDataSource = EcoMarketCloudDataSourceImpl(ecoMarketService)
}