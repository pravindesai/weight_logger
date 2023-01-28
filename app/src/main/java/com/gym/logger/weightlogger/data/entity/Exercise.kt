package com.gym.logger.weightlogger.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val exerciseId:Int,
    val exerciseName: String,
    val date: Date,
    val sessionId:Int
)
