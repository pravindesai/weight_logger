package com.gym.logger.weightlogger.ui.screen.setScreen

import androidx.lifecycle.ViewModel
import com.gym.logger.weightlogger.repository.SetsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SetViewModel @Inject constructor(
    private val setsRepository: SetsRepository
    ):ViewModel(){

    }