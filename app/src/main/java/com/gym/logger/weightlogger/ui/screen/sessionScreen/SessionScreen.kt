package com.gym.logger.weightlogger.ui.screen.sessionScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.gym.logger.weightlogger.app.NetworkState
import com.gym.logger.weightlogger.data.entity.Session
import com.gym.logger.weightlogger.ui.composable.AddSessionCard
import com.gym.logger.weightlogger.ui.composable.AppDialog
import com.gym.logger.weightlogger.ui.composable.SessionCard

@Composable
fun SessionScreen(
    sessionViewModel: SessionViewModel,
    onSessionSelected: (session: Session) -> Unit
) {
    val sessions: NetworkState<Session> by remember { sessionViewModel.sessions }.collectAsState()
    var showDeleteDialog by remember { mutableStateOf(false) }
    var selectedSession by remember { mutableStateOf(Session()) }

    if (showDeleteDialog) {
        AppDialog(
            title = "Are you sure you want to delete this session?",
            desc = "By deleting this session you will loose all the related data.",
            positiveButtonText = "Delete",
            negativeButtonText = "Cancel",
            onNegative = {
                showDeleteDialog = !showDeleteDialog
            }, OnPositive = {
                showDeleteDialog = !showDeleteDialog
                sessionViewModel.deleteSession(selectedSession)
            })
    }

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            when (sessions) {
                is NetworkState.Empty -> {}
                is NetworkState.Failure -> {}
                is NetworkState.Loading -> {}
                is NetworkState.Success -> {
                    items(sessions.data ?: listOf()) { session ->
                        SessionCard(session = session,
                            onSessionClicked = { sSession ->
                                onSessionSelected(sSession)
                            },
                            onLongClickedClicked = { sSession ->
                                selectedSession = sSession
                                showDeleteDialog = !showDeleteDialog
                            })
                    }
                }
            }
            item {
                AddSessionCard(hint = "Add New Session") { newSession ->
                    sessionViewModel.addSession(newSession)
                }
            }
        }
    }
}

