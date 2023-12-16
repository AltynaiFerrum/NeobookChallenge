package com.jyldyzferr.neobookchallenge.data.mappers

import com.jyldyzferr.neobookchallenge.data.cloud.models.EcoMarketResponseItemCloud
import com.jyldyzferr.neobookchallenge.domain.models.EcoMarketResponseItemDomain


fun EcoMarketResponseItemCloud.toDomain(): EcoMarketResponseItemDomain = this.run {
    EcoMarketResponseItemDomain(
        id = id,
        name = name,
        image = image
    )
}