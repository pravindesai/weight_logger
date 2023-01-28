package com.gym.logger.weightlogger.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.gym.logger.weightlogger.data.entity.Set
import kotlinx.coroutines.flow.Flow

@Dao
interface SetDao {
    @Query("SELECT * FROM `Set` WHERE setId == :setId LIMIT 1")
    fun findSetById(setId:Int): Flow<Set>


    @Query("SELECT * FROM `set`")
    fun getAllSet(): Flow<List<Set>>

    @Insert
    suspend fun insertAll(vararg set: Set)

    @Delete
    suspend fun delete(set: Set)
}