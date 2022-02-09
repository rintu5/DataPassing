package com.example.datapassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var user : EditText
    private lateinit var pass : EditText
    private lateinit var submit: Button
    private val userName = "Rajesh"
    private val password = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user = findViewById(R.id.user)
        pass = findViewById(R.id.pass)
        submit = findViewById(R.id.submit)

        submit.setOnClickListener {
            var userData = user.text.toString()
            var passwordbyuser =pass.text.toString()
            if (userData == userName && passwordbyuser == password){
                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("key1",userData.toString())
                startActivity(intent)
                Log.d("tag",userData.toString())
            }else{
                Toast.makeText(this, "user and pass is not matched", Toast.LENGTH_SHORT).show()
            }
        }

    }
}