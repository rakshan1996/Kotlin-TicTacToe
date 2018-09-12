package com.example.devilspc.tictactoe

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

 class Game:AppCompatActivity(){
    var type:Int = 0
    var name1:String = ""
    var name2:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)
        val myIntent=intent
        type=myIntent.extras.getInt("player")
        if(type==1)
        {
        name1=myIntent.extras.getString("player1")
            AI()
        }
        else
        {
            name1=myIntent.extras.getString("player1")
            name2=myIntent.extras.getString("player2")
            multi()
        }
    }
    fun AI(){
        var update=findViewById<TextView>(R.id.name1)
        update.text=name1
    }
    fun multi()
    {
        var update=findViewById<TextView>(R.id.name1)
        update.text=name1
        update=findViewById(R.id.name2)
        update.text=name2
    }


}