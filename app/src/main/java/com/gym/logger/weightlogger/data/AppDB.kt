package com.gym.logger.weightlogger.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.gym.logger.weightlogger.data.dao.ExerciseDao
import com.gym.logger.weightlogger.data.dao.SessionDao
import com.gym.logger.weightlogger.data.dao.SetDao
import com.gym.logger.weightlogger.data.entity.Exercise
import com.gym.logger.weightlogger.data.entity.Session
import com.gym.logger.weightlogger.data.entity.Set
import java.util.Date

@Database(entities = [Session::class,Exercise::class,Set::class], version = 3, exportSchema = false)
@TypeConverters(AppTypeConverters::class)
abstract class AppDB:RoomDatabase() {
    abstract fun exerciseDao():ExerciseDao
    abstract fun sessionDao():SessionDao
    abstract fun setDao():SetDao
}

object AppTypeConverters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }
}
