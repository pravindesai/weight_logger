package com.gym.logger.weightlogger.data

import android.content.Context
import androidx.room.Room
import com.gym.logger.weightlogger.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbHiltModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext app: Context
    ):AppDB = Room.databaseBuilder(
        app,
        AppDB::class.java,
        Constants.DB_NAME
    ).build()



    @Singleton
    @Provides
    fun provideExerciseDao(db: AppDB) = db.exerciseDao()

    @Singleton
    @Provides
    fun provideSessionDao(db: AppDB) = db.sessionDao()

    @Singleton
    @Provides
    fun provideSetDao(db: AppDB) = db.setDao()
}