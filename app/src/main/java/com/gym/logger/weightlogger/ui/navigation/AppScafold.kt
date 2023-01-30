package com.gym.logger.weightlogger.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScaffold(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()

    val currentScreen = AppScreens.valueOf(
        backStackEntry?.destination?.route ?: AppScreens.SESSION_SCREEN.name
    )
    val canNavigateBack = navController.previousBackStackEntry != null

    Scaffold(
        modifier = modifier,
        topBar = {
            AppBar(
                canNavigateBack = canNavigateBack,
                navigateUp = {
                    navController.navigateUp()
                },
                titleId = currentScreen.title
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            Host(navController = navController)
        }
    }
}
