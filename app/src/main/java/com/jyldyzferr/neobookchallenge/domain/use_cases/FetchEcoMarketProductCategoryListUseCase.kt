package com.jyldyzferr.neobookchallenge.domain.use_cases

import com.jyldyzferr.neobookchallenge.domain.models.EcoMarketResponseItemDomain

interface FetchEcoMarketProductCategoryListUseCase {

    suspend fun fetchEcoProductCategoryList(): List<EcoMarketResponseItemDomain>

}