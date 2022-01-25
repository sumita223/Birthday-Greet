package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.android.filament.View
import org.w3c.dom.Text

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val intent = intent
        val name = intent.getStringExtra(NAME_EXTRA)


        //val greet = findViewById< Text.View(>(R.id.greet))
        val greet = findViewById<TextView>(R.id.greet)
        //set text
        greet.text = "Happy Birthday\n$name"
        // Get text
        val greetString = greet.text.toString()


    }
}

