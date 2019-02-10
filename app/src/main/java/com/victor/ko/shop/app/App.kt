
package com.victor.ko.shop.app

import com.victor.ko.shop.app.di.AppComponent
import com.victor.ko.shop.app.di.AppModule
import com.victor.ko.shop.app.di.DaggerAppComponent
import android.app.Application

class App: Application() {
    companion object {
        private lateinit var app: App

        fun get(): App = app
    }

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        app = this

        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
        appComponent.inject(this)
    }

    fun getAppComponent(): AppComponent? = appComponent
}