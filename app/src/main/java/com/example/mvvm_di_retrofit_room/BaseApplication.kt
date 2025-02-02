package com.example.mvvm_di_retrofit_room

import android.app.Application
import com.example.mvvm_di_retrofit_room.repository.UserRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication : Application() {

    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()
        userRepository.createUser("Jeetin", 25)
    }

}