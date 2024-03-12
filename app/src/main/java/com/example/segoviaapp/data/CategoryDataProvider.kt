package com.example.segoviaapp.data

import com.example.segoviaapp.R
import com.example.segoviaapp.model.Category

object CategoryDataProvider {
    val defaulCategory = getCategoryData()[0]
    fun getCategoryData(): List<Category>{
        return listOf(
            Category(
                id = 1,
                titleCategoryId = R.string.coffee_title,
                imageCategoryId = R.drawable.coffee_category
            ),
            Category(
                id = 2,
                titleCategoryId = R.string.restaurant_title,
                imageCategoryId = R.drawable.restaurant_category
            ),
            Category(
                id = 3,
                titleCategoryId = R.string.kids_friendly_title,
                imageCategoryId = R.drawable.kids_friendly_category
            ),
            Category(
                id = 4,
                titleCategoryId = R.string.parks_title,
                imageCategoryId = R.drawable.park_category
            ),
            Category(
                id = 5,
                titleCategoryId = R.string.mall_title,
                imageCategoryId = R.drawable.mall_category
            )
        )
    }
}