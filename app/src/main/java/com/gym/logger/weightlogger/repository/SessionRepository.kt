package com.gym.logger.weightlogger.repository

import android.util.Log
import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.dao.SessionDao
import com.gym.logger.weightlogger.data.entity.Session
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception
import javax.inject.Inject

class SessionRepository @Inject constructor(
    private val sessionDao: SessionDao
) {

    suspend fun getAllSessions():Flow<NetworkState<Session>> = flow <NetworkState<Session>>{
            emit(NetworkState.Loading())
            try {

                val allSessions = sessionDao.getAllSession()
                allSessions.collect{
                    emit(
                        NetworkState.Success<Session>(data = it)
                    )
                }

            } catch (e: Exception) {
                emit(
                    NetworkState.Failure<Session>(message = e.message)
                )
            }

        }.flowOn(Dispatchers.IO)

    suspend fun addSession(session: Session){

        sessionDao.insertAll(session)

    }

    suspend fun deleteSession(session: Session){
        sessionDao.delete(session)
    }

    suspend fun findSessionById(sessionId:Int): Flow<NetworkState<out Any>> = flow {
        emit(NetworkState.Loading())
        try {

            val allSessions = sessionDao.findSessionById(sessionId)
            allSessions.collect {
                emit(
                    NetworkState.Success(data = listOf(it))
                )
            }

        } catch (e: Exception) {
            emit(
                NetworkState.Failure(message = e.message)
            )
        }

    }.flowOn(Dispatchers.IO)

}