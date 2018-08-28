package com.example.devilspc.tictactoe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class names :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myIntent=intent
       var type=myIntent.extras.getInt("single_Player")

           setContentView(R.layout.names)


    }
}