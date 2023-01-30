package com.gym.logger.weightlogger.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gym.logger.weightlogger.AppUtil
import com.gym.logger.weightlogger.data.entity.Exercise
import java.util.*

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ExerciseCard(
    session: Exercise,
    onSessionClicked: (session: Exercise) -> Unit = {},
    onLongClickedClicked: (session: Exercise) -> Unit = {}
) {

    val cardColors = CardDefaults.cardColors(
        containerColor = Color.Transparent,
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .combinedClickable(onClick = {
                    onSessionClicked(session)
                },
                    onLongClick = {
                        onLongClickedClicked(session)
                    }),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.5.dp, Color.Gray),
            colors = cardColors,

            ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Text(
                    text = session.exerciseName ?: "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(3.dp),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Start
                )
                Text(
                    text = AppUtil.getConvertedDate(session.date),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(3.dp),
                    fontSize = 12.sp,
                    textAlign = TextAlign.End,
                    color = Color.LightGray
                )
            }
        }
    }
}

@Preview
@Composable
fun ExerciseCardPreview() {
    ExerciseCard(session = Exercise(1, "Exercise1", Calendar.getInstance().time,1))
}