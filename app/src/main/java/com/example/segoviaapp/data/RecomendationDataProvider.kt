package com.example.segoviaapp.data

import com.example.segoviaapp.R
import com.example.segoviaapp.model.Recommendation

object RecommendationDataProvider {
    fun getRecommendationCoffee(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 1,
                category = "Coffee",
                titleRecommendationId = R.string.coffee1,
                recommendationDetails = R.string.information_coffee1,
                iconRecommendation = R.drawable.coffee_category,
                imageRecommendationId = R.drawable.cafeteria
            ),
            Recommendation(
                id = 2,
                category = "Coffee",
                titleRecommendationId = R.string.coffee2,
                recommendationDetails = R.string.information_coffee2,
                iconRecommendation = R.drawable.coffee_category,
                imageRecommendationId = R.drawable.cafeteria
            ),
            Recommendation(
                id = 3,
                category = "Coffee",
                titleRecommendationId = R.string.coffee3,
                recommendationDetails = R.string.information_coffee3,
                iconRecommendation = R.drawable.coffee_category,
                imageRecommendationId = R.drawable.cafeteria
            ),
            Recommendation(
                id = 4,
                category = "Coffee",
                titleRecommendationId = R.string.coffee4,
                recommendationDetails = R.string.information_coffee4,
                iconRecommendation = R.drawable.coffee_category,
                imageRecommendationId = R.drawable.cafeteria
            )
        )
    }

    fun getRecommendationRestaurant(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 5,
                category = "Restaurant",
                titleRecommendationId = R.string.restaurant1,
                recommendationDetails = R.string.information_restaurant1,
                iconRecommendation = R.drawable.restaurant_category,
                imageRecommendationId = R.drawable.restaurant_1
            ),
            Recommendation(
                id = 6,
                category = "Restaurant",
                titleRecommendationId = R.string.restaurant2,
                recommendationDetails = R.string.information_restaurant2,
                iconRecommendation = R.drawable.restaurant_category,
                imageRecommendationId = R.drawable.restaurant_1
            ),
            Recommendation(
                id = 7,
                category = "Restaurant",
                titleRecommendationId = R.string.restaurant3,
                recommendationDetails = R.string.information_restaurant3,
                iconRecommendation = R.drawable.restaurant_category,
                imageRecommendationId = R.drawable.restaurant_1
            ),
            Recommendation(
                id = 8,
                category = "Restaurant",
                titleRecommendationId = R.string.restaurant4,
                recommendationDetails = R.string.information_restaurant4,
                iconRecommendation = R.drawable.restaurant_category,
                imageRecommendationId = R.drawable.restaurant_1
            )
        )
    }

    fun getRecommendationPark(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 9,
                category = "Park",
                titleRecommendationId = R.string.park1,
                recommendationDetails = R.string.information_park1,
                iconRecommendation = R.drawable.park_category,
                imageRecommendationId = R.drawable.parque
            ),
            Recommendation(
                id = 10,
                category = "Park",
                titleRecommendationId = R.string.park2,
                recommendationDetails = R.string.information_park2,
                iconRecommendation = R.drawable.park_category,
                imageRecommendationId = R.drawable.parque
            ),
            Recommendation(
                id = 11,
                category = "Park",
                titleRecommendationId = R.string.park3,
                recommendationDetails = R.string.information_park3,
                iconRecommendation = R.drawable.park_category,
                imageRecommendationId = R.drawable.parque
            ),
            Recommendation(
                id = 12,
                category = "Park",
                titleRecommendationId = R.string.park4,
                recommendationDetails = R.string.information_park4,
                iconRecommendation = R.drawable.park_category,
                imageRecommendationId = R.drawable.parque
            )
        )
    }

    fun getRecommendationKidsFriendly(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 13,
                category = "Kids_Friendly",
                titleRecommendationId = R.string.kid_friendly1,
                recommendationDetails = R.string.information_kid_friendly1,
                iconRecommendation = R.drawable.kids_friendly_category,
                imageRecommendationId = R.drawable.kids_friendly
            ),
            Recommendation(
                id = 14,
                category = "Kids_Friendly",
                titleRecommendationId = R.string.kid_friendly2,
                recommendationDetails = R.string.information_kid_friendly2,
                iconRecommendation = R.drawable.kids_friendly_category,
                imageRecommendationId = R.drawable.kids_friendly
            ),
            Recommendation(
                id = 15,
                category = "Kids_Friendly",
                titleRecommendationId = R.string.kid_friendly3,
                recommendationDetails = R.string.information_kid_friendly3,
                iconRecommendation = R.drawable.kids_friendly_category,
                imageRecommendationId = R.drawable.kids_friendly
            ),
            Recommendation(
                id = 16,
                category = "Kids_Friendly",
                titleRecommendationId = R.string.kid_friendly4,
                recommendationDetails = R.string.information_kid_friendly4,
                iconRecommendation = R.drawable.kids_friendly_category,
                imageRecommendationId = R.drawable.kids_friendly
            )
        )
    }

    fun getRecommendationMall(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 17,
                category = "Mall",
                titleRecommendationId = R.string.mall1,
                recommendationDetails = R.string.information_shopping1,
                iconRecommendation = R.drawable.mall_category,
                imageRecommendationId = R.drawable.mall
            ),
            Recommendation(
                id = 18,
                category = "Mall",
                titleRecommendationId = R.string.mall2,
                recommendationDetails = R.string.information_shopping2,
                iconRecommendation = R.drawable.mall_category,
                imageRecommendationId = R.drawable.mall
            ),
            Recommendation(
                id = 19,
                category = "Mall",
                titleRecommendationId = R.string.mall3,
                recommendationDetails = R.string.information_shopping3,
                iconRecommendation = R.drawable.mall_category,
                imageRecommendationId = R.drawable.mall
            ),
            Recommendation(
                id = 20,
                category = "Mall",
                titleRecommendationId = R.string.mall4,
                recommendationDetails = R.string.information_shopping4,
                iconRecommendation = R.drawable.mall_category,
                imageRecommendationId = R.drawable.mall
            )
        )
    }

}