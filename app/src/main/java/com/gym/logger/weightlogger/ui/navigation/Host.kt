package com.gym.logger.weightlogger.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gym.logger.weightlogger.data.entity.Exercise
import com.gym.logger.weightlogger.data.entity.Session
import com.gym.logger.weightlogger.ui.screen.exerciseScreen.ExerciseScreen
import com.gym.logger.weightlogger.ui.screen.sessionScreen.SessionScreen
import com.gym.logger.weightlogger.ui.screen.setScreen.SetScreen

private object NavKeys {
    val SELECTED_SESSION = "selectedSession"
    val SELECTED_EXERCISE = "selectedExercise"
}

@Composable
fun Host(modifier: Modifier = Modifier, navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AppScreens.SESSION_SCREEN.name,
        modifier = modifier
    ) {

        composable(route = AppScreens.SESSION_SCREEN.name) {
            SessionScreen(sessionViewModel = hiltViewModel(),
                onSessionSelected = { selectedSession ->
                    navController.currentBackStackEntry?.savedStateHandle?.set(
                        NavKeys.SELECTED_SESSION,
                        selectedSession
                    )
                    navController.navigate(AppScreens.EXERCISE_SCREEN.name)
                })
        }

        composable(route = AppScreens.EXERCISE_SCREEN.name) {
            val selectedSession =
                navController.previousBackStackEntry?.savedStateHandle?.get<Session>(NavKeys.SELECTED_SESSION)
            ExerciseScreen(
                exerciseViewModel = hiltViewModel(),
                selectedSession = selectedSession,
                onExerciseSelected = { exercise ->
                    navController.currentBackStackEntry?.savedStateHandle?.set(
                        NavKeys.SELECTED_EXERCISE,
                        exercise
                    )
                    navController.navigate(AppScreens.SET_SCREEN.name)
                }
            )
        }

        composable(route = AppScreens.SET_SCREEN.name) {
            val selectedExercise =
                navController.previousBackStackEntry?.savedStateHandle?.get<Exercise>(NavKeys.SELECTED_EXERCISE)
            SetScreen(
                exercise = selectedExercise,
                setViewModel = hiltViewModel()
            )
        }

    }
}