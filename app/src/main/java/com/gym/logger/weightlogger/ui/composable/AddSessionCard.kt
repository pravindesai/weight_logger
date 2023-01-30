package com.gym.logger.weightlogger.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gym.logger.weightlogger.data.entity.Exercise
import com.gym.logger.weightlogger.data.entity.Session
import java.util.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddSessionCard(hint:String?="", onSaveButtonClick:(session:Session)->Unit) {
    var newSession: Session by remember { mutableStateOf(Session()) }
    var sessionName by remember { mutableStateOf(TextFieldValue("")) }


    val colors = TextFieldDefaults.textFieldColors(
        focusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        containerColor = Color.Transparent
    )
    val cardColors = CardDefaults.cardColors(
        containerColor = Color.Transparent,
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, Color.Gray),
            colors = cardColors
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 2.dp, end = 5.dp, top = 2.dp, bottom = 2.dp)) {
                TextField(value = sessionName, onValueChange = {
                    if (it.text.length < 20) {
                        sessionName = it
                        newSession.sessionName = sessionName.text
                    }
                }, placeholder = { Text(hint?:"") },
                    singleLine = true,
                    colors = colors,
                    modifier = Modifier.weight(0.70f)
                )

                Button(
                    onClick = {
                        newSession.dateCreated = Calendar.getInstance().time
                        onSaveButtonClick(newSession)

                        sessionName = TextFieldValue()
                        newSession = Session()
                    },
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(0.30f)
                ) {
                    Text(text = "Save")
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddExerciseCard(hint:String?="", onSaveButtonClick:(exercise:Exercise)->Unit) {
    var newSession: Exercise by remember { mutableStateOf(Exercise()) }
    var exerciseName by remember { mutableStateOf(TextFieldValue("")) }


    val colors = TextFieldDefaults.textFieldColors(
        focusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        containerColor = Color.Transparent
    )
    val cardColors = CardDefaults.cardColors(
        containerColor = Color.Transparent,
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.dp, Color.Gray),
            colors = cardColors
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 2.dp, end = 5.dp, top = 2.dp, bottom = 2.dp)) {
                TextField(value = exerciseName, onValueChange = {
                    if (it.text.length < 20) {
                        exerciseName = it
                        newSession.exerciseName = exerciseName.text
                    }
                }, placeholder = { Text(hint?:"") },
                    singleLine = true,
                    colors = colors,
                    modifier = Modifier.weight(0.70f)
                )

                Button(
                    onClick = {
                        newSession.date = Calendar.getInstance().time
                        onSaveButtonClick(newSession)

                        exerciseName = TextFieldValue()
                        newSession = Exercise()
                    },
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(0.30f)
                ) {
                    Text(text = "Save")
                }
            }
        }
    }
}

