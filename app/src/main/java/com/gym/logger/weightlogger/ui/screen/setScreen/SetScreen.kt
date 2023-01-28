package com.gym.logger.weightlogger.ui.screen.setScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SetScreen(setViewModel: SetViewModel){

    Column(modifier = Modifier.fillMaxSize().background(Color.Green)) {
        Button(onClick = {
        }) {
            Text(text = "Click to Add")
        }
    }

}