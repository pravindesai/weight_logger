package com.gym.logger.weightlogger.ui.screen.setScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.entity.Set
import com.gym.logger.weightlogger.repository.SetsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SetViewModel @Inject constructor(
    private val setsRepository: SetsRepository
    ):ViewModel(){

    private val TAG = "***SetViewModel"
    private val _sets: MutableStateFlow<NetworkState<Set>> = MutableStateFlow(NetworkState.Empty())
    val sets = _sets.asStateFlow()



    init {
        viewModelScope.launch {
            setsRepository.getAllSets().catch {
                Log.e(TAG, "Exception ${it.message}" )
            }.collectLatest {

                when(it){
                    is NetworkState.Empty->{
                        _sets.value = NetworkState.Empty()
                    }
                    is NetworkState.Loading->{
                        _sets.value = NetworkState.Loading()
                    }
                    is NetworkState.Failure->{
                        _sets.value = NetworkState.Failure(message = it.message)
                    }
                    is NetworkState.Success->{
                        _sets.value = NetworkState.Success(data = it.data)
                    }
                }

            }
        }
    }

    fun addSession(set: Set) {
        viewModelScope.launch {
            setsRepository.addSet(
                set
            )
        }
    }

    fun deleteSession(set: Set) {
        viewModelScope.launch {
            setsRepository.deleteSet(
                set
            )
        }
    }

}