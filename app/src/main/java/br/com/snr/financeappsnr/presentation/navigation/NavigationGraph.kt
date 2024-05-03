package br.com.snr.financeappsnr.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.snr.financeappsnr.presentation.feature.home.HomeScreen
import br.com.snr.financeappsnr.presentation.feature.login.LoginScreen
import br.com.snr.financeappsnr.presentation.feature.newtransactions.NewTransactionsScreen
import br.com.snr.financeappsnr.presentation.feature.register.RegisterScreen
import br.com.snr.financeappsnr.presentation.feature.transactions.TransactionsScreen

@Composable
internal fun NavigationGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = FinanceRoutes.Login.route
    ) {
        composable(route = FinanceRoutes.Login.route) {
            LoginScreen()
        }

        composable(route = FinanceRoutes.Register.route) {
            RegisterScreen()
        }

        composable(route = FinanceRoutes.Home.route) {
            HomeScreen()
        }

        composable(route = FinanceRoutes.Transactions.route) {
            TransactionsScreen()
        }

        composable(route = FinanceRoutes.NewTransactions.route) {
            NewTransactionsScreen()
        }
    }
}