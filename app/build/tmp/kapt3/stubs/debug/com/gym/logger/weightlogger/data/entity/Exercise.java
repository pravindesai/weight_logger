package com.gym.logger.weightlogger.data.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/gym/logger/weightlogger/data/entity/Exercise;", "", "exerciseId", "", "exerciseName", "", "date", "Ljava/util/Date;", "sessionId", "(ILjava/lang/String;Ljava/util/Date;I)V", "getDate", "()Ljava/util/Date;", "getExerciseId", "()I", "getExerciseName", "()Ljava/lang/String;", "getSessionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Exercise {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int exerciseId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String exerciseName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date date = null;
    private final int sessionId = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.gym.logger.weightlogger.data.entity.Exercise copy(int exerciseId, @org.jetbrains.annotations.NotNull
    java.lang.String exerciseName, @org.jetbrains.annotations.NotNull
    java.util.Date date, int sessionId) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Exercise(int exerciseId, @org.jetbrains.annotations.NotNull
    java.lang.String exerciseName, @org.jetbrains.annotations.NotNull
    java.util.Date date, int sessionId) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getExerciseId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExerciseName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getSessionId() {
        return 0;
    }
}