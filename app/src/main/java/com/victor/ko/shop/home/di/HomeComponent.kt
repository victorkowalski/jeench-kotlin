package com.victor.ko.shop.home.di

import com.victor.ko.shop.app.di.scopes.PerScreen
import com.victor.ko.shop.home.HomeModule
import com.victor.ko.shop.main.view.HomeActivity
import dagger.Subcomponent

@PerScreen
@Subcomponent(modules = [(HomeModule::class)])
interface HomeComponent {
    //fun inject(homePresenter: HomePresenterImpl)
    fun inject(homeActivity: HomeActivity)
}