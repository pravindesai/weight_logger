package com.gym.logger.weightlogger.data;

import android.content.Context;
import androidx.room.Room;
import com.gym.logger.weightlogger.Constants;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/gym/logger/weightlogger/data/DbHiltModule;", "", "()V", "provideAppDatabase", "Lcom/gym/logger/weightlogger/data/AppDB;", "app", "Landroid/content/Context;", "provideExerciseDao", "Lcom/gym/logger/weightlogger/data/dao/ExerciseDao;", "db", "provideSessionDao", "Lcom/gym/logger/weightlogger/data/dao/SessionDao;", "provideSetDao", "Lcom/gym/logger/weightlogger/data/dao/SetDao;", "app_debug"})
@dagger.Module
public final class DbHiltModule {
    @org.jetbrains.annotations.NotNull
    public static final com.gym.logger.weightlogger.data.DbHiltModule INSTANCE = null;
    
    private DbHiltModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.gym.logger.weightlogger.data.AppDB provideAppDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.gym.logger.weightlogger.data.dao.ExerciseDao provideExerciseDao(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.data.AppDB db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.gym.logger.weightlogger.data.dao.SessionDao provideSessionDao(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.data.AppDB db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.gym.logger.weightlogger.data.dao.SetDao provideSetDao(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.data.AppDB db) {
        return null;
    }
}