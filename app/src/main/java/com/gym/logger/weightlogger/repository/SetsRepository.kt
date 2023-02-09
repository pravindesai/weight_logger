package com.gym.logger.weightlogger.repository

import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.dao.SetDao
import com.gym.logger.weightlogger.data.entity.Set
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class SetsRepository @Inject constructor(
    private val setDao: SetDao
) {

    suspend fun getAllSets(): Flow<NetworkState<Set>> = flow <NetworkState<Set>>{
        emit(NetworkState.Loading())
        try {

            val allSets = setDao.getAllSet()
            allSets.collect{
                emit(
                    NetworkState.Success<Set>(data = it)
                )
            }

        } catch (e: Exception) {
            emit(
                NetworkState.Failure<Set>(message = e.message)
            )
        }

    }.flowOn(Dispatchers.IO)

    suspend fun addSet(set:Set){

        setDao.insertAll(set)

    }

    suspend fun deleteSet(set:Set){
        setDao.delete(set)
    }

    suspend fun findSetById(setId:Int): Flow<NetworkState<out Any>> = flow {
        emit(NetworkState.Loading())
        try {

            val allSets = setDao.findSetById(setId)
            allSets.collect {
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