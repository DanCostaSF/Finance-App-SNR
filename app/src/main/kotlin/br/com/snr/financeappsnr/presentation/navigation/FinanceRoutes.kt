package br.com.snr.financeappsnr.presentation.navigation

sealed class FinanceRoutes(val route: String) {

    data object Home : FinanceRoutes(route = "finance_home")

    data object Login : FinanceRoutes(route = "finance_login")

    data object Register : FinanceRoutes(route = "finance_register")

    data object Transactions : FinanceRoutes(route = "finance_transactions")

    data object NewTransactions : FinanceRoutes(route = "finance_newtransactions")
}