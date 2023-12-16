package com.jyldyzferr.neobookchallenge.data.cloud.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class EcoMarketResponse(
    @SerializedName("results")
    val results: List<EcoMarketResponseItemCloud>
) :Parcelable