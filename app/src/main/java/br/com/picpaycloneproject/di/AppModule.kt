package br.com.picpaycloneproject.di

import br.com.picpaycloneproject.ui.dashboard.DashboardViewModel
import br.com.picpaycloneproject.ui.home.HomeViewModel
import br.com.picpaycloneproject.ui.notifications.NotificationsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { DashboardViewModel() }
    viewModel { NotificationsViewModel() }
}