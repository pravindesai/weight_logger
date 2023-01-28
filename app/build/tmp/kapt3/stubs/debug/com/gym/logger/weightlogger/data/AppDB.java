package com.gym.logger.weightlogger.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import com.gym.logger.weightlogger.data.dao.ExerciseDao;
import com.gym.logger.weightlogger.data.dao.SessionDao;
import com.gym.logger.weightlogger.data.dao.SetDao;
import com.gym.logger.weightlogger.data.entity.Exercise;
import com.gym.logger.weightlogger.data.entity.Session;
import com.gym.logger.weightlogger.data.entity.Set;
import java.util.Date;

@androidx.room.TypeConverters(value = {com.gym.logger.weightlogger.data.AppTypeConverters.class})
@androidx.room.Database(entities = {com.gym.logger.weightlogger.data.entity.Session.class, com.gym.logger.weightlogger.data.entity.Exercise.class, com.gym.logger.weightlogger.data.entity.Set.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/gym/logger/weightlogger/data/AppDB;", "Landroidx/room/RoomDatabase;", "()V", "exerciseDao", "Lcom/gym/logger/weightlogger/data/dao/ExerciseDao;", "sessionDao", "Lcom/gym/logger/weightlogger/data/dao/SessionDao;", "setDao", "Lcom/gym/logger/weightlogger/data/dao/SetDao;", "app_debug"})
public abstract class AppDB extends androidx.room.RoomDatabase {
    
    public AppDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.gym.logger.weightlogger.data.dao.ExerciseDao exerciseDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.gym.logger.weightlogger.data.dao.SessionDao sessionDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.gym.logger.weightlogger.data.dao.SetDao setDao();
}