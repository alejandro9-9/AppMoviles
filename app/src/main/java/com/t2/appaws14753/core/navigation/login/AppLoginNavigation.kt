package com.t2.appaws14753.core.navigation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.t2.appaws14753.presentation.screen.login.LoginScreen

fun NavGraphBuilder.loginGraph(onLoginSuccess: () -> Unit) {
    composable(NavPath.LOGIN) {
        LoginScreen { usuario ->
            onLoginSuccess()
        }
    }
}
