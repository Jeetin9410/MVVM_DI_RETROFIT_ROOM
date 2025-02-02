package com.example.mvvm_di_retrofit_room.di

import android.content.Context
import com.example.mvvm_di_retrofit_room.BaseApplication
import com.example.mvvm_di_retrofit_room.repositories.NotificationRepository
import com.example.mvvm_di_retrofit_room.repositories.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun getApplicationContext (app: BaseApplication) : Context  = app

    @Provides
    @Singleton
    @AppName
    fun provideAppName() : String = "Jeetin Kumar"
}

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(
        context: BaseApplication
    ): String = "Retrofit Object is here"

}

@Module
class UserRepositoryModule {

    @Provides
    @Singleton
    fun provideUserRepository( data: UserRepository.userRepoImpl) : UserRepository = data
}

@Module
class NotificationModule {

    @Singleton
    @Provides
    @EmailService
    fun provideEmailService(repo : NotificationRepository.EmailNotification): NotificationRepository = repo

    @Provides
    @Singleton
    @SmsService
    fun provideSmsService(): NotificationRepository = NotificationRepository.SmsNotification()
}
