package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn =findViewById<Button>(R.id.createBirthdayButton)
        btn.setOnClickListener {
            val name= findViewById<EditText>(R.id.nameInput)
            val n=name.editableText.toString()
            Toast.makeText(this, "Name is $n", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,BirthdayGreetingActivity::class.java)
            //intent.putExtra("name",n)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,n)
            // now value of NAME_EXTRA will be same in both activities
            startActivity(intent)
        }
    }




}




