package com.gym.logger.weightlogger.ui.screen.exerciseScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.entity.Exercise
import com.gym.logger.weightlogger.data.entity.Session
import com.gym.logger.weightlogger.repository.ExerciseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExerciseViewModel @Inject constructor(
    private val exerciseRepository: ExerciseRepository
):ViewModel() {

    private val TAG = "***ExerciseViewModel"
    private val _exercise: MutableStateFlow<NetworkState<Exercise>> = MutableStateFlow(NetworkState.Empty())
    val exercise = _exercise.asStateFlow()
    val selectedSession: Session = Session()

    fun getAllExerciseFor(sessionId:Int){
        viewModelScope.launch {
            exerciseRepository.getAllExercisesFor(sessionId = sessionId).catch {
                Log.e(TAG, "Exception ${it.message}" )
            }.collectLatest {

                when(it){
                    is NetworkState.Empty->{
                        _exercise.value = NetworkState.Empty()
                    }
                    is NetworkState.Loading->{
                        _exercise.value = NetworkState.Loading()
                    }
                    is NetworkState.Failure->{
                        _exercise.value = NetworkState.Failure(message = it.message)
                    }
                    is NetworkState.Success->{
                        _exercise.value = NetworkState.Success(data = it.data)
                    }
                }

            }
        }
    }

    fun addExercise(exercise: Exercise) {
        viewModelScope.launch {
            exerciseRepository.addExercise(
                exercise
            )
        }
    }

    fun deleteSession(exercise: Exercise) {
        viewModelScope.launch {
            exerciseRepository.deleteExercise(
                exercise
            )
        }
    }


}