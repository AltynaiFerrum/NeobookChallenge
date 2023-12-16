package com.jyldyzferr.neobookchallenge.domain.models

import java.util.UUID

data class EcoMarketResponseItemDomain(
    val name: String,
    val id: Int,
    val image: String,
){
    companion object{
        val preview = EcoMarketResponseItemDomain(
            id = UUID.randomUUID().hashCode(),
            name = "",
            image = "",
        )
    }
}

