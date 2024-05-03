package br.com.snr.financeappsnr

import android.app.Application
import br.com.snr.financeappsnr.di.FinanceDI
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(FinanceDI.module)
        }
    }
}