package com.example.mvvm_di_retrofit_room.di

import com.example.mvvm_di_retrofit_room.BaseApplication
import com.example.mvvm_di_retrofit_room.MainActivity
import com.example.mvvm_di_retrofit_room.repositories.NotificationRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, UserRepositoryModule::class, NotificationModule::class])
interface AppComponent {
    fun inject(app: BaseApplication)

    fun inject(mainActivity: MainActivity)

}