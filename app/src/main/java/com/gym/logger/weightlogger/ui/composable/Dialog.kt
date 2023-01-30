package com.gym.logger.weightlogger.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Preview
@Composable
fun AppDialog(
    title:String?=null,
    desc:String?=null,
    positiveButtonText:String = "Yes",
    negativeButtonText:String = "No",
    onNegative: () -> Unit = {},
    OnPositive: () -> Unit = {}) {

    Dialog(
        onDismissRequest = { onNegative() }, properties = DialogProperties(
            dismissOnBackPress = false, dismissOnClickOutside = false
        )
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            elevation = CardDefaults.cardElevation()
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White).padding(15.dp)
            ) {
                title?.let {
                    Text(
                        text = it,
                        modifier = Modifier.padding(8.dp), fontSize = 20.sp
                    )
                }
                desc?.let {
                    Text(
                        text = it,
                        modifier = Modifier.padding(8.dp)
                    )
                }

                Row(Modifier.padding(top = 10.dp)) {
                    OutlinedButton(
                        onClick = { onNegative() },
                        Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .weight(1F)
                    ) {
                        Text(text = negativeButtonText)
                    }
                    Button(
                        onClick = { OnPositive() },
                        Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .weight(1F)
                    ) {
                        Text(text = positiveButtonText)
                    }
                }
            }
        }
    }
}

