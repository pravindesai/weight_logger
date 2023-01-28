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
    private val _sessions = MutableStateFlow(NetworkState.Empty)
    val sessions = _sessions.asStateFlow()

    val newSessions = MutableStateFlow(Session())

    init {
            viewModelScope.launch {
                sessionRepository.getAllSessions().catch {
                    Log.e(TAG, "Exception ${it.message}" )
                }.collectLatest {

                    when(it){
                        is NetworkState.Empty->{
                            Log.e(TAG, "EMPTY" )
                        }
                        is NetworkState.Loading->{
                            Log.e(TAG, "LOADING" )
                        }
                        is NetworkState.Failure->{
                            Log.e(TAG, "FAiled: ${it.message}" )

                        }
                        is NetworkState.Success->{
                            Log.e(TAG, "SUCESS ${it.data}" )
                        }
                    }

                }
            }
    }

    fun addSession(){
        viewModelScope.launch {
            sessionRepository.addSession(
                Session(
                    sessionId = 0,
                    sessionName = "AAA",
                    dateCreated = Calendar.getInstance().time
                )

            )
        }
    }

}