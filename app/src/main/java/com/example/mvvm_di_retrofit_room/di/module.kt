package com.example.mvvm_di_retrofit_room.di

import com.example.mvvm_di_retrofit_room.repository.EmailRepository
import com.example.mvvm_di_retrofit_room.repository.NotificationService
import com.example.mvvm_di_retrofit_room.repository.SmsRepository
import com.example.mvvm_di_retrofit_room.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NotificationModule {

    @Provides
    fun providesNotificationRepository(): NotificationService {
        return SmsRepository()
    }

    @Provides
    @EmailService
    fun provideEmailService( emailService: EmailRepository): NotificationService = emailService
}


// Below code means i binded SmsRepository to ve returned always when NotificationService is being
// thats why it is used Bind

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class NotificationModulee {

    @Binds
    abstract fun bindsSmsRepository(smsRepository: SmsRepository): NotificationService
}*/
