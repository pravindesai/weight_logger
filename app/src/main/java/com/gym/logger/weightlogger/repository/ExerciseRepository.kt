package com.gym.logger.weightlogger.repository

import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.dao.ExerciseDao
import com.gym.logger.weightlogger.data.entity.Exercise
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ExerciseRepository @Inject constructor(
    private val exerciseDao: ExerciseDao
) {


    suspend fun getAllExercisesFor(sessionId: Int): Flow<NetworkState<Exercise>> = flow <NetworkState<Exercise>>{
        emit(NetworkState.Loading())
        try {

            val allSessions = exerciseDao.getAllExercisesForId(sessionId = sessionId)
            allSessions.collect{
                emit(
                    NetworkState.Success<Exercise>(data = it)
                )
            }

        } catch (e: Exception) {
            emit(
                NetworkState.Failure<Exercise>(message = e.message)
            )
        }

    }.flowOn(Dispatchers.IO)

    suspend fun addExercise(exercise: Exercise){

        exerciseDao.insertAll(exercise)

    }

    suspend fun deleteExercise(exercise: Exercise){
        exerciseDao.delete(exercise)
    }

    suspend fun findExerciseById(sessionId:Int): Flow<NetworkState<out Any>> = flow {
        emit(NetworkState.Loading())
        try {

            val allSessions = exerciseDao.findExerciseById(sessionId)
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