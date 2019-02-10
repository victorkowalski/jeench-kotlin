/*
 *  Copyright 2018 Andrea Bresolin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.victor.ko.shop.app.di

import com.victor.ko.shop.app.di.scopes.PerApplication

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule constructor(private val application: Application) {

    /*@Provides
    @PerApplication
    internal fun provideWeatherRepository(repository: WeatherRepositoryImpl): WeatherRepository {
        return repository
    }

    @Provides
    internal fun provideCoroutinesManager(): CoroutinesManager {
        return DefaultCoroutinesManager()
    }

    @Provides
    internal fun provideAsyncTasksManager(): AsyncTasksManager {
        return DefaultAsyncTasksManager()
    }*/
}