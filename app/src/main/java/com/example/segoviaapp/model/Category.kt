package com.example.segoviaapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Category(
    val id: Int,
    @StringRes val titleCategoryId: Int,
    @DrawableRes val imageCategoryId: Int,
)