package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun createBirthdayCard(view: View) {
            //val nameInput = findViewById<EditText>(R.id.nameInput)
            //val name=nameInput.editableText.toString()
            Toast.makeText(this,"Name is Birthday Card Created", Toast.LENGTH_LONG).show()
        }
    }

    fun createBirthdayCard(view: View) {

        val nameInput: EditText =findViewById(R.id.nameInput)
        val name=nameInput.text.toString()
        //Toast.makeText(this, "name is $name", Toast.LENGTH_SHORT).show()*/

        val intent= Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}