package com.gym.logger.weightlogger.ui.screen.exerciseScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.entity.Exercise
import com.gym.logger.weightlogger.data.entity.Session
import com.gym.logger.weightlogger.ui.composable.*

@Composable
fun ExerciseScreen(
    exerciseViewModel: ExerciseViewModel,
    selectedSession: Session? = null,
    onExerciseSelected: (exericse:Exercise) -> Unit
) {
    val exercises: NetworkState<Exercise> by remember { exerciseViewModel.exercise }.collectAsState()
    var showDeleteDialog by remember { mutableStateOf(false) }
    var selectedExercise by remember { mutableStateOf(Exercise()) }

    LaunchedEffect(true){
        selectedSession?.sessionId?.let { exerciseViewModel.getAllExerciseFor(it) }
    }
    
    if (showDeleteDialog) {
        AppDialog(
            title = "Are you sure you want to delete this Exercise?",
            desc = "By deleting this exercise you will loose all the related data.",
            positiveButtonText = "Delete",
            negativeButtonText = "Cancel",
            onNegative = {
                showDeleteDialog = !showDeleteDialog
            }, OnPositive = {
                showDeleteDialog = !showDeleteDialog
                exerciseViewModel.deleteSession(selectedExercise)
            })
    }

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            when (exercises) {
                is NetworkState.Empty -> {}
                is NetworkState.Failure -> {}
                is NetworkState.Loading -> {}
                is NetworkState.Success -> {
                    items(exercises.data ?: listOf()) { session ->
                        ExerciseCard(session = session,
                            onSessionClicked = { sSession ->
                                onExerciseSelected(sSession)
                            },
                            onLongClickedClicked = { exercise ->
                                selectedExercise = exercise
                                showDeleteDialog = !showDeleteDialog
                            })
                    }
                }
            }
            item {
                AddExerciseCard(hint = "Add New Exercise") { newExercise ->
                    newExercise.sessionId = selectedSession?.sessionId
                    exerciseViewModel.addExercise(newExercise)
                }
            }
        }
    }
}