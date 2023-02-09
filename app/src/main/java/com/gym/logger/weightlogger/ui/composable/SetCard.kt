package com.gym.logger.weightlogger.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gym.logger.weightlogger.AppUtil
import com.gym.logger.weightlogger.R
import com.gym.logger.weightlogger.data.entity.Set
import java.util.Calendar

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun SetCard(
    set: Set,
    onSetClicked: (set: Set) -> Unit = {},
    onLongClickedClicked: (set: Set) -> Unit = {},
    onSaveButtonClicked: (set: Set) -> Unit = {}
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
                    onSetClicked(set)
                },
                    onLongClick = {
                        onLongClickedClicked(set)
                    }),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(1.5.dp, Color.Gray),
            colors = cardColors,

            ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(5.dp)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(2f, true)
                            .padding(5.dp)
                            .wrapContentHeight()
                            .wrapContentWidth()
                    ) {

                        Text(
                            text = "Weight",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(3.dp),
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Gray
                        )

                        Text(
                            text = set.weight.toString(),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(3.dp),
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        )

                    }

                    Column(
                        modifier = Modifier
                            .weight(2f, true)
                            .padding(5.dp)
                            .wrapContentHeight()
                            .wrapContentWidth()

                    ) {
                        Text(
                            text = "Set",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(3.dp),
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Gray
                        )

                        Text(
                            text = set.reps.toString(),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(3.dp),
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Black
                        )
                    }

                    Column(
                        modifier = Modifier
                            .padding(10.dp)
                            .wrapContentHeight()
                            .wrapContentWidth()

                    ) {
                        Image(
                            painterResource(if (set.isEditing) R.drawable.check else R.drawable.edit),
                            contentDescription = "",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clickable {
                                    onSaveButtonClicked(set)
                                }
                        )
                    }
                }



                Text(
                    text = AppUtil.getConvertedDate(set.createdDate),
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
fun SetCardPreview() {
    SetCard(
        set = Set(
            1,
            "Set",
            Calendar.getInstance().time,
            Calendar.getInstance().time.time,
            2,
            20.5f,
            3,
            true
        )
    )
}


@Composable
fun Stepper(value: Float, onPlusClick: () -> Unit = {}, onMinusClick: () -> Unit = {}) {




}

@Preview
@Composable
fun StepperPreview() {
    Stepper(10f)
}