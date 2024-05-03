package br.com.snr.financeappsnr.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.snr.financeappsnr.presentation.navigation.NavigationGraph
import br.com.snr.financeappsnr.ui.theme.FinanceAppSnrTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            FinanceAppSnrTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CallNavigation(navController = navController)
                }
            }
        }
    }
}

@Composable
private fun CallNavigation(navController: NavHostController) {
    NavigationGraph(navController = navController)
}