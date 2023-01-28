package com.gym.logger.weightlogger.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/gym/logger/weightlogger/data/entity/Session;", "", "sessionId", "", "sessionName", "", "dateCreated", "Ljava/util/Date;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)V", "getDateCreated", "()Ljava/util/Date;", "getSessionId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSessionName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)Lcom/gym/logger/weightlogger/data/entity/Session;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Session {
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Integer sessionId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String sessionName = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date dateCreated = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.gym.logger.weightlogger.data.entity.Session copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer sessionId, @org.jetbrains.annotations.Nullable
    java.lang.String sessionName, @org.jetbrains.annotations.Nullable
    java.util.Date dateCreated) {
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
    
    public Session() {
        super();
    }
    
    public Session(@org.jetbrains.annotations.Nullable
    java.lang.Integer sessionId, @org.jetbrains.annotations.Nullable
    java.lang.String sessionName, @org.jetbrains.annotations.Nullable
    java.util.Date dateCreated) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSessionId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSessionName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getDateCreated() {
        return null;
    }
}