package com.gym.logger.weightlogger;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import com.gym.logger.weightlogger.data.dao.ExerciseDao;
import com.gym.logger.weightlogger.ui.navigation.AppScreens;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/gym/logger/weightlogger/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "exerciseDao", "Lcom/gym/logger/weightlogger/data/dao/ExerciseDao;", "getExerciseDao", "()Lcom/gym/logger/weightlogger/data/dao/ExerciseDao;", "setExerciseDao", "(Lcom/gym/logger/weightlogger/data/dao/ExerciseDao;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.activity.ComponentActivity {
    @javax.inject.Inject
    public com.gym.logger.weightlogger.data.dao.ExerciseDao exerciseDao;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.gym.logger.weightlogger.data.dao.ExerciseDao getExerciseDao() {
        return null;
    }
    
    public final void setExerciseDao(@org.jetbrains.annotations.NotNull
    com.gym.logger.weightlogger.data.dao.ExerciseDao p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}