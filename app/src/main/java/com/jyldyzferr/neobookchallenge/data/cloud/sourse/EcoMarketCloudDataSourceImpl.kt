package com.jyldyzferr.neobookchallenge.data.cloud.sourse

import com.jyldyzferr.neobookchallenge.data.cloud.models.EcoMarketResponseItemCloud
import com.jyldyzferr.neobookchallenge.data.cloud.network.EcoMarketService

class EcoMarketCloudDataSourceImpl(
    private val ecoMarketService: EcoMarketService
): EcoMarketCloudDataSource {
    override suspend fun fetchProductCategoryList(): List<EcoMarketResponseItemCloud> {
      return  try {
            val ecoMarketService = ecoMarketService.fetchProductCategoryList()
            if (ecoMarketService.isSuccessful){
                ecoMarketService.body()?.results ?: emptyList()
            } else{
                emptyList()
            }
        } catch (e: Throwable){
            emptyList()
        }
    }
}