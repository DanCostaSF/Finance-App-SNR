package br.com.snr.financeappsnr.di

import org.koin.dsl.module

object FinanceDI {
    val module = module {
        includes(DataModule.module)

        //TODO: adicionar useCase(se usar) e viewModels aqui
    }
}