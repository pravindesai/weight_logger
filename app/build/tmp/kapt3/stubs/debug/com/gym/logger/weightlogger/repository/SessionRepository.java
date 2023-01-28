package com.gym.logger.weightlogger.repository;

import com.gym.logger.weightlogger.app.NetworkState;
import com.gym.logger.weightlogger.data.dao.SessionDao;
import com.gym.logger.weightlogger.data.entity.Session;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import java.lang.Exception;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\'\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/gym/logger/weightlogger/repository/SessionRepository;", "", "sessionDao", "Lcom/gym/logger/weightlogger/data/dao/SessionDao;", "(Lcom/gym/logger/weightlogger/data/dao/SessionDao;)V", "addSession", "", "session", "Lcom/gym/logger/weightlogger/data/entity/Session;", "(Lcom/gym/logger/weightlogger/data/entity/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSession", "findSessionById", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gym/logger/weightlogger/app/NetworkState;", "sessionId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SessionRepository {
    private final com.gym.logger.weightlogger.data.dao.SessionDao sessionDao = null;
    
    @javax.inject.Inject
    public SessionRepository(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.data.dao.SessionDao sessionDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllSessions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.gym.logger.weightlogger.app.NetworkState<? extends java.lang.Object>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addSession(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.data.entity.Session session, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteSession(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.data.entity.Session session, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object findSessionById(int sessionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.gym.logger.weightlogger.app.NetworkState<? extends java.lang.Object>>> continuation) {
        return null;
    }
}