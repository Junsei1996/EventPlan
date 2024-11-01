package com.example.eventplan.presentation.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.eventplan.presentation.navigation.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        Text("Splash Screen")

        LaunchedEffect(Unit){
            handleNavigation(navController)
        }

    }

}


suspend fun handleNavigation(navController: NavController) {
    delay(2000)
    navController.navigate(route = Screen.Login.route)
}