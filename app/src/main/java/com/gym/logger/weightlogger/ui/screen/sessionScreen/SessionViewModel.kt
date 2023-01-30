package com.gym.logger.weightlogger.ui.screen.sessionScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.entity.Session
import com.gym.logger.weightlogger.repository.SessionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.util.Calendar
import javax.inject.Inject

@HiltViewModel
class SessionViewModel @Inject constructor(
    private val sessionRepository: SessionRepository
):ViewModel() {
    private val TAG = "***SessionViewModel"
    private val _sessions:MutableStateFlow<NetworkState<Session>> = MutableStateFlow(NetworkState.Empty())
    val sessions = _sessions.asStateFlow()

    init {
            viewModelScope.launch {
                sessionRepository.getAllSessions().catch {
                    Log.e(TAG, "Exception ${it.message}" )
                }.collectLatest {

                    when(it){
                        is NetworkState.Empty->{
                            _sessions.value = NetworkState.Empty()
                        }
                        is NetworkState.Loading->{
                            _sessions.value = NetworkState.Loading()
                        }
                        is NetworkState.Failure->{
                            _sessions.value = NetworkState.Failure(message = it.message)
                        }
                        is NetworkState.Success->{
                            _sessions.value = NetworkState.Success(data = it.data)
                        }
                    }

                }
            }
    }

    fun addSession(newSession: Session) {
        viewModelScope.launch {
            sessionRepository.addSession(
                newSession
            )
        }
    }

    fun deleteSession(session: Session) {
        viewModelScope.launch {
            sessionRepository.deleteSession(
                session
            )
        }
    }

}