package com.example.mvvm_di_retrofit_room

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_di_retrofit_room.di.EmailService
import com.example.mvvm_di_retrofit_room.repository.NotificationService
import com.example.mvvm_di_retrofit_room.repository.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRepository: UserRepository

    /*@Inject
    lateinit var viewModel: MainViewModel*/

    @Inject
    @EmailService
    lateinit var notificationService: NotificationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        userRepository.createUser("Maurya", 210)
        notificationService.send("jeetin@jnu.ac.in", "TEst body")
    }
}