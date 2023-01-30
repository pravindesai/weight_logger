package com.gym.logger.weightlogger.data.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Entity
@Parcelize
data class Set(
    @PrimaryKey(autoGenerate = true)
    val setId:Int,
    val setName:String,
    val createdDate:Date,
    val timeInMiles:Long,
    val exerciseId:Int,
    val weight:Float,
    val reps:Int
    ) : Parcelable
