package com.example.mvvm_di_retrofit_room.repositories

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun sessionId(): String
    fun saveSessionId(sessionId: String)

    fun userId(): String
    fun saveUserId(userId: String)

    class userRepoImpl @Inject constructor() : UserRepository {
        override fun sessionId(): String = "abcdefghij"

        override fun saveSessionId(sessionId: String) {
            Log.d("TAG", "saveSessionId saved: $sessionId")
        }

        override fun userId(): String  = "UserId0007"

        override fun saveUserId(userId: String) {
            Log.d("TAG", "saveUserId saved: $userId")
        }

    }

}


interface NotificationRepository {
    fun sendMsg(message: String)

    class EmailNotification @Inject constructor() : NotificationRepository {
        override fun sendMsg(message: String) {
            Log.d("TAG", "sendMsg via Email: $message")
        }
    }

    class SmsNotification: NotificationRepository {
        override fun sendMsg(message: String) {
            Log.d("TAG", "sendMsg via Sms: $message")
        }
    }
}

