package com.gym.logger.weightlogger.ui.screen.sessionScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gym.logger.weightlogger.data.entity.Session

@Composable
fun SessionScreen(sessionViewModel: SessionViewModel, onSessionSelected: () -> Unit) {
    val sessions by remember { sessionViewModel.sessions }.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn {

            item {
                AddSession()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddSession() {
    val newSession: Session by remember { mutableStateOf(Session()) }
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

    Column(modifier = Modifier.fillMaxWidth().padding()) {
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            elevation = CardDefaults.outlinedCardElevation(defaultElevation = 2.dp),
            colors = cardColors
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)) {
                TextField(value = sessionName, onValueChange = {
                    if (it.text.length < 20) {
                        sessionName = it
                    }
                }, placeholder = { Text("Add New Session") },
                    singleLine = true,
                    colors = colors,
                    modifier = Modifier.weight(0.75f)
                )

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(0.25f)
                ) {
                    Text(text = "Save")
                }
            }
        }
    }
}

@Preview
@Composable
fun AddSessionPreview() {
    AddSession()
}