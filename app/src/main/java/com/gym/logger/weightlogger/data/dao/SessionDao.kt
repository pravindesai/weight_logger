package com.gym.logger.weightlogger.data.dao

import androidx.room.*
import com.gym.logger.weightlogger.data.entity.Exercise
import com.gym.logger.weightlogger.data.entity.Session
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {

    @Query("SELECT * FROM Session WHERE sessionId == :sessionId LIMIT 1")
    fun findSessionById(sessionId:Int): Flow<Session>


    @Query("SELECT * FROM Session")
    fun getAllSession(): Flow<List<Session>>

    @Upsert
    suspend fun insertAll(vararg session: Session)

    @Delete
    suspend fun delete(session: Session)
}