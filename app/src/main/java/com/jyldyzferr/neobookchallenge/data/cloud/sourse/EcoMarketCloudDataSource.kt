package com.jyldyzferr.neobookchallenge.data.cloud.sourse

import com.jyldyzferr.neobookchallenge.data.cloud.models.EcoMarketResponseItemCloud

interface EcoMarketCloudDataSource {
    suspend fun fetchProductCategoryList(): List<EcoMarketResponseItemCloud>
}