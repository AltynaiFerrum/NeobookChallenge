package com.jyldyzferr.neobookchallenge.domain.use_cases

import com.jyldyzferr.neobookchallenge.domain.models.EcoMarketResponseItemDomain
import com.jyldyzferr.neobookchallenge.domain.repository.EcoMarketRepository
import javax.inject.Inject
class FetchEcoMarketProductCategoryListImpl @Inject constructor(
private val ecoMarketRepository: EcoMarketRepository
) : FetchEcoMarketProductCategoryListUseCase {
    override suspend fun fetchEcoProductCategoryList(): List<EcoMarketResponseItemDomain> {
        return  ecoMarketRepository.fetchProductCategoryList()
    }
}