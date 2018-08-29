package com.example.devilspc.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.nio.file.attribute.AttributeView

class Landing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
    }

    fun GetName(view: View){

        var BuId=view as Button
        when(BuId.id)
        {
            R.id.SinglePlayer -> {
                val myIntent=Intent(this,names::class.java)
                myIntent.putExtra("single_Player",1)
                startActivity(myIntent)



            }

            R.id.MultiPlayer -> {
                val myIntent=Intent(this,names::class.java)
                myIntent.putExtra("single_Player",2)
                startActivity(myIntent)

            }
        }

    }
}
