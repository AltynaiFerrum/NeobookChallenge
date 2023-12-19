package com.jyldyzferr.neobookchallenge.data.cloud.network

import com.jyldyzferr.neobookchallenge.data.cloud.models.EcoMarketResponse
import retrofit2.Response
import retrofit2.http.GET

interface EcoMarketService {
    @GET("/swagger/product_category_list")
    suspend fun fetchProductCategoryList(): Response<EcoMarketResponse>

}