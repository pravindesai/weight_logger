package com.gym.logger.weightlogger.ui.navigation

import androidx.annotation.StringRes
import com.gym.logger.weightlogger.R

enum class AppScreens(@StringRes val title:Int) {
    SESSION_SCREEN(title = R.string.screen_session_title),
    EXERCISE_SCREEN(title = R.string.screen_exercise_title),
    SET_SCREEN(title = R.string.screen_set_title),
}