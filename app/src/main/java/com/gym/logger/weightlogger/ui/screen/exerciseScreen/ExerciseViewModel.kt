package com.gym.logger.weightlogger.ui.screen.exerciseScreen

import androidx.lifecycle.ViewModel
import com.gym.logger.weightlogger.repository.ExerciseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExerciseViewModel @Inject constructor(
    private val exerciseRepository: ExerciseRepository
):ViewModel() {
}