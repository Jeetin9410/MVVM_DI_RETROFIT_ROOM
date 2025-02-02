package com.example.mvvm_di_retrofit_room

import android.app.Application
import com.example.mvvm_di_retrofit_room.di.appModule
import com.example.mvvm_di_retrofit_room.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(listOf(appModule, viewModelModule))
        }
    }

}