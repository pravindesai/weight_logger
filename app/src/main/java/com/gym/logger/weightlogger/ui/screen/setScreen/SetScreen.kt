package com.gym.logger.weightlogger.ui.screen.setScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.gym.logger.weightlogger.data.entity.Exercise

@Composable
fun SetScreen(
              exercise: Exercise?=null,
              setViewModel: SetViewModel){

    Column(modifier = Modifier.fillMaxSize().background(Color.Green)) {
        Button(onClick = {
        }) {
            Text(text = "exercise${exercise?.exerciseName}")
        }
    }

}