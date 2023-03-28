package com.example.weather_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    val city: String = "Dhanbad, IN"
    val api: String ="4a5439fa9b7cf0e36774a5eca94f929e"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myExecutor = Executors.newSingleThreadExecutor()
        val myHandler = Handler(Looper.getMainLooper())

        myExecutor.execute {

        }

        myHandler.post {

        }
    }
}