package com.gym.logger.weightlogger.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Session(
    @PrimaryKey(autoGenerate = true)
    val sessionId:Int?=null,
    val sessionName:String?=null,
    val dateCreated:Date?=null,
)
