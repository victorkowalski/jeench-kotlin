package com.victor.ko.shop.app.di

import com.victor.ko.shop.app.App
import com.victor.ko.shop.app.di.scopes.PerApplication
import com.victor.ko.shop.home.HomeModule
import com.victor.ko.shop.home.di.HomeComponent

import dagger.Component

@PerApplication
@Component(modules = [(AppModule::class), (NetworkModule::class)])
interface AppComponent {
    fun inject(application: App)
    fun plus(module: HomeModule): HomeComponent
    //fun plus(module: ForecastModule): ForecastComponent
}