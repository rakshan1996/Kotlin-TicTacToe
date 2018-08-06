package com.example.devilspc.tictactoe

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
                Toast.makeText(this,"Single Player Game Selected",Toast.LENGTH_SHORT).show()
            }

            R.id.MultiPlayer -> {
                Toast.makeText(this,"Multi Player Game Selected",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
