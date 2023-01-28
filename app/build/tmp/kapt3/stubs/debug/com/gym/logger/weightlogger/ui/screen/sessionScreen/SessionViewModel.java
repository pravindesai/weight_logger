package com.gym.logger.weightlogger.ui.screen.sessionScreen;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.gym.logger.weightlogger.app.NetworkState;
import com.gym.logger.weightlogger.data.entity.Session;
import com.gym.logger.weightlogger.repository.SessionRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Calendar;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/gym/logger/weightlogger/ui/screen/sessionScreen/SessionViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionRepository", "Lcom/gym/logger/weightlogger/repository/SessionRepository;", "(Lcom/gym/logger/weightlogger/repository/SessionRepository;)V", "TAG", "", "_sessions", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/gym/logger/weightlogger/app/NetworkState$Empty;", "newSessions", "Lcom/gym/logger/weightlogger/data/entity/Session;", "getNewSessions", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "sessions", "Lkotlinx/coroutines/flow/StateFlow;", "getSessions", "()Lkotlinx/coroutines/flow/StateFlow;", "addSession", "", "app_debug"})
public final class SessionViewModel extends androidx.lifecycle.ViewModel {
    private final com.gym.logger.weightlogger.repository.SessionRepository sessionRepository = null;
    private final java.lang.String TAG = "***SessionViewModel";
    private final kotlinx.coroutines.flow.MutableStateFlow<com.gym.logger.weightlogger.app.NetworkState.Empty> _sessions = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.gym.logger.weightlogger.app.NetworkState.Empty> sessions = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.gym.logger.weightlogger.data.entity.Session> newSessions = null;
    
    @javax.inject.Inject
    public SessionViewModel(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.repository.SessionRepository sessionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.gym.logger.weightlogger.app.NetworkState.Empty> getSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.gym.logger.weightlogger.data.entity.Session> getNewSessions() {
        return null;
    }
    
    public final void addSession() {
    }
}