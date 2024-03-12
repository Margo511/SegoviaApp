package com.example.segoviaapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recommendation (
    val id: Int,
    val category: String,
    @StringRes val titleRecommendationId: Int,
    @DrawableRes val iconRecommendation: Int,
    @DrawableRes val imageRecommendationId: Int,
    @StringRes val recommendationDetails: Int
)