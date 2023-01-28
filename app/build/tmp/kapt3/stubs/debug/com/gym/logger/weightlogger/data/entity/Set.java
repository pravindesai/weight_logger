package com.gym.logger.weightlogger.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\fH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lcom/gym/logger/weightlogger/data/entity/Set;", "", "setId", "", "setName", "", "createdDate", "Ljava/util/Date;", "timeInMiles", "", "exerciseId", "weight", "", "reps", "(ILjava/lang/String;Ljava/util/Date;JIFI)V", "getCreatedDate", "()Ljava/util/Date;", "getExerciseId", "()I", "getReps", "getSetId", "getSetName", "()Ljava/lang/String;", "getTimeInMiles", "()J", "getWeight", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Set {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int setId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String setName = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date createdDate = null;
    private final long timeInMiles = 0L;
    private final int exerciseId = 0;
    private final float weight = 0.0F;
    private final int reps = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.gym.logger.weightlogger.data.entity.Set copy(int setId, @org.jetbrains.annotations.NotNull
    java.lang.String setName, @org.jetbrains.annotations.NotNull
    java.util.Date createdDate, long timeInMiles, int exerciseId, float weight, int reps) {
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
    
    public Set(int setId, @org.jetbrains.annotations.NotNull
    java.lang.String setName, @org.jetbrains.annotations.NotNull
    java.util.Date createdDate, long timeInMiles, int exerciseId, float weight, int reps) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getSetId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSetName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedDate() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getTimeInMiles() {
        return 0L;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getExerciseId() {
        return 0;
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float getWeight() {
        return 0.0F;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getReps() {
        return 0;
    }
}