package com.example.mvvm_di_retrofit_room.repository

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun createUser(name: String, age: Int) {
        Log.d("TAG", "User created with name: $name and age: $age")
    }
}

interface NotificationService {
    fun send(to: String, body: String)
}

class EmailRepository @Inject constructor(): NotificationService {
    override fun send(to: String, body: String) {
        Log.d("TAGG", "Email sent to: $to with body: $body")
    }
}

class SmsRepository : NotificationService {
    override fun send(to: String, body: String) {
        Log.d("TAGG", "SMS sent to: $to with body: $body")
    }
}

