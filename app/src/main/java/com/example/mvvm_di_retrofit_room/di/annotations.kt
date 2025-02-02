package com.example.mvvm_di_retrofit_room.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class AppName

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class EmailService

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class SmsService
