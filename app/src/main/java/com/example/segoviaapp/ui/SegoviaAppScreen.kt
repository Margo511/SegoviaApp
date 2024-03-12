package com.example.segoviaapp.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.segoviaapp.R
import com.example.segoviaapp.model.Category
import com.example.segoviaapp.utils.CategoryContentType

enum class SegoviaAppScreen(@StringRes var title: Int) {
    MainScreen(title = R.string.app_name),
    Category(title = R.string.parks_title),
    Recommendation(title = R.string.restaurant1)
}

@Composable
fun MySegoviaApp(
    windowSize: WindowWidthSizeClass,
    onBackPressed: () -> Unit,
) {
    val navController: NavHostController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = SegoviaAppScreen.valueOf(
        backStackEntry?.destination?.route ?: SegoviaAppScreen.MainScreen.name
    )
    val viewModel: SegoviaAppViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    val contentType = when (windowSize) {
        WindowWidthSizeClass.Compact,
        WindowWidthSizeClass.Medium -> CategoryContentType.ListOnly

        WindowWidthSizeClass.Expanded -> CategoryContentType.ListAndDetail
        else -> CategoryContentType.ListOnly
    }

    Scaffold(topBar = {
        SegoviaTopBar(
            currentScreen = currentScreen,
            canNavigateBack = navController.previousBackStackEntry != null,
            navigateUp = { navController.navigateUp() },
            isShowingListPage = uiState.isShowingListPage,
            windowSize = windowSize
        )
    }) {
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = SegoviaAppScreen.MainScreen.name,
            modifier = Modifier.padding(it)
        ) {
            //composable()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SegoviaTopBar(
    currentScreen: SegoviaAppScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Boolean,
    isShowingListPage: Boolean,
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier,
    uiState: CategoryUiState = CategoryUiState()
) {
    val isShowingDetailPage = windowSize != WindowWidthSizeClass.Expanded && !isShowingListPage
    val currentCategory = when (uiState.currentCategoryName) {
        R.string.parks_title -> stringResource(id = R.string.parks_title)
        R.string.restaurant_title -> stringResource(id = R.string.restaurant_title)
        R.string.coffee_title -> stringResource(id = R.string.coffee_title)
        R.string.mall_title -> stringResource(id = R.string.mall_title)
        else -> stringResource(id = R.string.kids_friendly_title)
    }
    TopAppBar(title = {
        if (currentScreen.title.equals(stringResource(id = R.string.app_name))) {
            Text(text = stringResource(id = currentScreen.title))
        } else {
            if (isShowingDetailPage) {
                Text(
                    text = currentCategory
                )
            } else {
                Text(text = currentCategory + " Info")
            }
        }
    }, colors = TopAppBarDefaults.mediumTopAppBarColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = { navigateUp() }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Go Back")
                }
            }
        })
}

