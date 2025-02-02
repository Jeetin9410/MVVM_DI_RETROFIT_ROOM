package com.example.mvvm_di_retrofit_room.viewModel

import androidx.lifecycle.ViewModel
import com.example.mvvm_di_retrofit_room.Student
import com.example.mvvm_di_retrofit_room.Teacher


class MainViewModel(val student: Student, val teacher: Teacher) : ViewModel() {
    fun doWork() {
        student.doLearning()
        teacher.doTeaching()
    }
}