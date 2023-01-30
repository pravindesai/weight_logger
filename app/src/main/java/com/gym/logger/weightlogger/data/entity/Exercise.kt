package com.gym.logger.weightlogger.data.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.Companion.CASCADE
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Entity
@Parcelize
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    var exerciseId:Int?=null,
    var exerciseName: String?=null,
    var date: Date?=null,
    var sessionId:Int?=null,
) : Parcelable
