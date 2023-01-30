package com.gym.logger.weightlogger.data.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.Date

@Parcelize
@Entity
data class Session(
    @PrimaryKey(autoGenerate = true)
    var sessionId:Int?=null,
    var sessionName:String?=null,
    var dateCreated:Date?=null,
) : Parcelable
