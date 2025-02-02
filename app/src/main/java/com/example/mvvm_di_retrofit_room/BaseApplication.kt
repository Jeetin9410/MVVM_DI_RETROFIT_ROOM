package com.example.mvvm_di_retrofit_room

import android.app.Application
import com.example.mvvm_di_retrofit_room.di.AppComponent
import com.example.mvvm_di_retrofit_room.di.DaggerAppComponent

class BaseApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }
    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this);
    }
}