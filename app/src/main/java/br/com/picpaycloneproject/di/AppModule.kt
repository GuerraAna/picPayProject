package br.com.picpaycloneproject.di

import br.com.picpaycloneproject.ui.componente.ComponenteViewModel
import br.com.picpaycloneproject.ui.pagar.PagarViewModel
import br.com.picpaycloneproject.ui.home.HomeViewModel
import br.com.picpaycloneproject.ui.notifications.AjusteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { PagarViewModel() }
    viewModel { AjusteViewModel() }
    viewModel { ComponenteViewModel() }
}