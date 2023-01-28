package com.gym.logger.weightlogger.ui.screen.exerciseScreen

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
fun ExerciseScreen(exerciseViewModel: ExerciseViewModel,onExerciseSelected:()->Unit){
    Column(modifier = Modifier.fillMaxSize().background(Color.LightGray)) {
        Button(onClick = {
            onExerciseSelected()
        }) {
            Text(text = "Click to Add")
        }
    }
}