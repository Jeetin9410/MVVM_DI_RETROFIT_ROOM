package com.example.mvvm_di_retrofit_room

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvm_di_retrofit_room.viewModel.MainViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val school by inject<School>()  // will work as late init
    val viewModel by inject<MainViewModel>()  // will work as late init

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val school = get<School>() // this will fetch the object of school , using koin

        //school.doSchoolWork()

        viewModel.doWork()
    }
}

class School(val student: Student, val teacher: Teacher) {

    fun doSchoolWork() {
        student.doLearning()
        teacher.doTeaching()
    }

}

class Student {
    fun doLearning() {
        Log.d("School", "Students are learning")
    }
}

class Teacher {

    fun doTeaching() {
        Log.d("School", "Teachers are teaching")
    }

}