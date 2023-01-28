package com.gym.logger.weightlogger.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.gym.logger.weightlogger.data.entity.Exercise
import kotlinx.coroutines.flow.Flow

@Dao
interface ExerciseDao{

    @Query("SELECT * FROM Exercise WHERE exerciseId == :exerciseId LIMIT 1")
    fun findExerciseById(exerciseId:Int): Flow<Exercise>


    @Query("SELECT * FROM Exercise")
    fun getAllExercises():Flow<List<Exercise>>

    @Insert
    suspend fun insertAll(vararg exercise: Exercise)

    @Delete
    suspend fun delete(exercise: Exercise)

}
