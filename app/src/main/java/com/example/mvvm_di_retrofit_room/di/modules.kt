package com.example.mvvm_di_retrofit_room.di

import com.example.mvvm_di_retrofit_room.School
import com.example.mvvm_di_retrofit_room.Student
import com.example.mvvm_di_retrofit_room.Teacher
import com.example.mvvm_di_retrofit_room.viewModel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { Teacher() }  // single -->  singleton

    factory { Student() }  // factory --> Creates new instant every time called

    factory { School(get(), get()) }  // here koin already know how to make object of Teacher and student

}

val viewModelModule = module {
    viewModel { MainViewModel( get(), get() ) }
}