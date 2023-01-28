package com.gym.logger.weightlogger.ui.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    navigateUp: () -> Unit = {},
    canNavigateBack: Boolean = false,
    titleId: Int
) {
    val appBarModifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight(
            align = Alignment.CenterVertically
        )

//    TopAppBar(
//        title = { Text(stringResource(titleId), modifier = Modifier.wrapContentHeight()) },
//        modifier = appBarModifier,
//        navigationIcon = {
//            if (canNavigateBack) {
//                IconButton(onClick = navigateUp) {
//                    Icon(
//                        imageVector = Icons.Filled.ArrowBack,
//                        contentDescription = ""
//                    )
//                }
//            }
//        }
//    )

    Row(modifier = appBarModifier) {
        if (canNavigateBack) {
            IconButton(onClick = navigateUp) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = ""
                )
            }
        }
        Text(
            stringResource(titleId),
            modifier = Modifier
                .wrapContentHeight()
                .size(16.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
    }
}
