package com.example.nakama.learnkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

class MainActivity2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
        println("Start")

        // Start a coroutine
        launch {
//            delay(1000)
            Thread.sleep(1000)
            Log.i("Test", "Hello")
        }
        launch {
//            delay(1000)
            Thread.sleep(1000)
            Log.i("Test", "Hello2")
        }

        launch {
//            delay(1000)
            Thread.sleep(1000)
            Log.i("Test", "Hello3")
        }

//        Thread.sleep(2000) // wait for 2 seconds
        Log.i("Test", "Stop")
    }
}
