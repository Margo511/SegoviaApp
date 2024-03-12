package com.example.segoviaapp.ui

import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.segoviaapp.data.CategoryDataProvider
import com.example.segoviaapp.data.RecommendationDataProvider
import com.example.segoviaapp.model.Category
import com.example.segoviaapp.model.Recommendation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class SegoviaAppViewModel : ViewModel(){
    private val _uiState = MutableStateFlow(
        CategoryUiState(
            categoryList = CategoryDataProvider.getCategoryData(),
            currentCategory = CategoryDataProvider.getCategoryData().getOrElse(0) {
                CategoryDataProvider.defaulCategory
            }
        )
    )
    val uiState: StateFlow<CategoryUiState> = _uiState

    fun updateCurrentCategory(selectedCategory: Category) {
        _uiState.update {
            it.copy(currentCategory = selectedCategory, currentCategoryName = selectedCategory.titleCategoryId)
        }
    }

    fun updateCurrentRecommendation(selectedRecommendation : Recommendation){
        _uiState.update {
            it.copy(currentRecommendation = selectedRecommendation)
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }


    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }
}

data class CategoryUiState(
    val categoryList: List<Category> = emptyList(),
    val currentCategory: Category = CategoryDataProvider.defaulCategory,
    val currentCategoryName: Int = 0,
    val isShowingListPage: Boolean = true,
    val currentRecommendation: Recommendation? = null
)