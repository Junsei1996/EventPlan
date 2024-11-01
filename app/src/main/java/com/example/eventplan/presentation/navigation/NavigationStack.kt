package com.example.eventplan.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eventplan.presentation.authFlow.forgotPassword.ForgotPasswordScreen
import com.example.eventplan.presentation.authFlow.login.LoginScreen
import com.example.eventplan.presentation.authFlow.signup.SignUpScreen
import com.example.eventplan.presentation.authFlow.updatePassword.UpdatePasswordScreen
import com.example.eventplan.presentation.authFlow.verify.VerifyScreen
import com.example.eventplan.presentation.splash.SplashScreen

@Composable
fun NavigationStack() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screen.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screen.ForgotPassword.route){
            ForgotPasswordScreen(navController)
        }
        composable(route = Screen.SignUp.route){
            SignUpScreen(navController)
        }
        composable(route = Screen.UpdatePassword.route){
            UpdatePasswordScreen(navController)
        }
        composable(route = Screen.Verify.route){
            VerifyScreen(navController)
        }
    }

}