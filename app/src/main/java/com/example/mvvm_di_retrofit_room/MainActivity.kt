package com.example.mvvm_di_retrofit_room

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mvvm_di_retrofit_room.di.AppName
import com.example.mvvm_di_retrofit_room.di.EmailService
import com.example.mvvm_di_retrofit_room.repositories.NotificationRepository
import com.example.mvvm_di_retrofit_room.repositories.UserRepository
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @AppName
    lateinit var appName: String

    @Inject
    lateinit var userRepo: UserRepository

    @Inject
    @EmailService
    lateinit var notifyUser: NotificationRepository

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as BaseApplication).appComponent.inject(this)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.text).text = userRepo.userId()

        notifyUser.sendMsg("Hello Jeetin")

    }
}