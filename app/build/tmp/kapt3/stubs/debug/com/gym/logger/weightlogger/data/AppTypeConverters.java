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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/gym/logger/weightlogger/data/AppTypeConverters;", "", "()V", "dateToTimestamp", "", "date", "Ljava/util/Date;", "(Ljava/util/Date;)Ljava/lang/Long;", "fromTimestamp", "value", "(Ljava/lang/Long;)Ljava/util/Date;", "app_debug"})
public final class AppTypeConverters {
    @org.jetbrains.annotations.NotNull
    public static final com.gym.logger.weightlogger.data.AppTypeConverters INSTANCE = null;
    
    private AppTypeConverters() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.util.Date fromTimestamp(@org.jetbrains.annotations.Nullable
    java.lang.Long value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.Long dateToTimestamp(@org.jetbrains.annotations.Nullable
    java.util.Date date) {
        return null;
    }
}