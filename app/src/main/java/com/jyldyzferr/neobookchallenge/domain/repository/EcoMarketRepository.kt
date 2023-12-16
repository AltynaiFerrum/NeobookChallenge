package com.jyldyzferr.neobookchallenge.domain.repository

import com.jyldyzferr.neobookchallenge.domain.models.EcoMarketResponseItemDomain

interface EcoMarketRepository {
    suspend fun fetchProductCategoryList(): List<EcoMarketResponseItemDomain>

}