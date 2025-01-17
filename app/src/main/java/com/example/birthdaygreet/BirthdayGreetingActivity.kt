package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        //val name= intent.getStringExtra("name")
        val name= intent.getStringExtra(NAME_EXTRA)
        val greet= findViewById<TextView>(R.id.birthdaGreeting)
        greet.text="Happy Birthday\n$name!"
    }
}