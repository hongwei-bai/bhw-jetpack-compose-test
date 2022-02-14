package com.example.composetest.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.composetest.ui.viewmodel.SplashViewModel
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val splashViewModel = hiltViewModel<SplashViewModel>()
    val preFetchCompleted = splashViewModel.preFetchCompleted.observeAsState().value
    if (preFetchCompleted == true) {
//        navController.navigate("main")
//        {
//            popUpTo("splash")
//            { inclusive = true }
//            launchSingleTop = true
//        }

        LaunchedEffect(key1 = false) {
            delay(4000)
            navController.popBackStack()
            navController.navigate("main")
        }
    }

    Text("Splash....")
}