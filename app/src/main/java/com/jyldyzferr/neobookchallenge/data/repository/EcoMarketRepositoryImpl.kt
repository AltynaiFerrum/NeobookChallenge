package com.jyldyzferr.neobookchallenge.data.repository

import com.jyldyzferr.neobookchallenge.data.cloud.sourse.EcoMarketCloudDataSource
import com.jyldyzferr.neobookchallenge.data.mappers.toDomain
import com.jyldyzferr.neobookchallenge.domain.models.EcoMarketResponseItemDomain
import com.jyldyzferr.neobookchallenge.domain.repository.EcoMarketRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class EcoMarketRepositoryImpl @Inject constructor(
    private val cloudDataSource: EcoMarketCloudDataSource
) : EcoMarketRepository {
    override suspend fun fetchProductCategoryList(): List<EcoMarketResponseItemDomain> {
        return cloudDataSource.fetchProductCategoryList().map { it.toDomain() }
    }
}
