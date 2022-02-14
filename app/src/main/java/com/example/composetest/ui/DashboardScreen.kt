package com.example.composetest.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.composetest.ui.viewmodel.DashboardViewModel

@Composable
fun DashboardScreen() {
    val viewModel = hiltViewModel<DashboardViewModel>()

    Text("Dashboard")
}