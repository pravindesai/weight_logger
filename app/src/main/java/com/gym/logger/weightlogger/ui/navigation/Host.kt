package com.gym.logger.weightlogger.ui.navigation

    import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gym.logger.weightlogger.ui.screen.exerciseScreen.ExerciseScreen
import com.gym.logger.weightlogger.ui.screen.sessionScreen.SessionScreen
import com.gym.logger.weightlogger.ui.screen.setScreen.SetScreen

@Composable
fun Host(modifier: Modifier = Modifier, navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AppScreens.SESSION_SCREEN.name,
        modifier = modifier
    ) {

        composable(route = AppScreens.SESSION_SCREEN.name) {
            SessionScreen(sessionViewModel = hiltViewModel(),
            onSessionSelected = {
                navController.navigate(AppScreens.EXERCISE_SCREEN.name)
            })
        }

        composable(route = AppScreens.EXERCISE_SCREEN.name) {
            ExerciseScreen(
                exerciseViewModel = hiltViewModel(),
                onExerciseSelected = {
                    navController.navigate(AppScreens.SET_SCREEN.name)
                }
            )
        }

        composable(route = AppScreens.SET_SCREEN.name) {
            SetScreen(setViewModel = hiltViewModel())
        }

    }
}