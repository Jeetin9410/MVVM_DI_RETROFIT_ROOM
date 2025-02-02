package com.example.mvvm_di_retrofit_room.viewModels

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvm_di_retrofit_room.repositories.NotificationRepository
import com.example.mvvm_di_retrofit_room.repositories.UserRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val userRepo: UserRepository,
    val notifyUser: NotificationRepository,
): ViewModel() {

}
