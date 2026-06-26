package com.t2.appaws14753

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.t2.appaws14753.core.navigation.cliente.clienteGraph
import com.t2.appaws14753.core.navigation.login.loginGraph
import com.t2.appaws14753.core.navigation.login.NavPath as LoginPath
import com.t2.appaws14753.core.navigation.cliente.NavPath as ClientePath
import com.t2.appaws14753.presentation.components.cliente.AppBottomBar
import com.t2.appaws14753.presentation.components.cliente.AppTopBar
import com.t2.appaws14753.ui.theme.AppAWS14753Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppAWS14753Theme {
                val navHostController = rememberNavController()
                val navBackStackEntry by navHostController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                val showBars = currentRoute != null && currentRoute != LoginPath.LOGIN

                Scaffold(
                    topBar = { if (showBars) AppTopBar(navHostController) },
                    bottomBar = { if (showBars) AppBottomBar(navHostController) }
                ) { paddingValues ->
                    NavHost(
                        navController = navHostController,
                        startDestination = LoginPath.LOGIN,
                        modifier = Modifier.padding(paddingValues)
                    ) {
                        loginGraph(
                            onLoginSuccess = {
                                navHostController.navigate(ClientePath.HOME) {
                                    popUpTo(LoginPath.LOGIN) { inclusive = true }
                                }
                            }
                        )
                        clienteGraph()
                    }
                }
            }
        }
    }
}