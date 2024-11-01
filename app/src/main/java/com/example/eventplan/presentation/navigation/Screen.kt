package com.example.eventplan.presentation.navigation

sealed class Screen(val route:String){
    object Main:Screen("main_screen")
    object Splash: Screen("splash_screen")
    object Login:Screen("login_screen")
    object SignUp:Screen("sign_up_screen")
    object Verify:Screen("verify_screen")
    object ForgotPassword:Screen("forgot_password_screen")
    object UpdatePassword:Screen("update_password_screen")
}
