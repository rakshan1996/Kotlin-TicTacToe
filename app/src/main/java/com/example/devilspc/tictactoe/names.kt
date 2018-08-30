package com.example.devilspc.tictactoe

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

 class names :AppCompatActivity(){
    public  var type:Int = 0
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myIntent=intent
       type=myIntent.extras.getInt("single_Player")
           setContentView(R.layout.names)
        if(type==1)
        {
            findViewById<TextView>(R.id.Player2).visibility=View.INVISIBLE
            findViewById<EditText>(R.id.Value2).visibility=View.INVISIBLE
        }
    }
    fun StartGame(view: View){
        if(type==1)
        {
            var player1=findViewById<EditText>(R.id.Value1)
            var name1=player1.text.toString()
            var myIntent=Intent(this,Game::class.java)
            myIntent.putExtra("player1",name1)
            myIntent.putExtra("player",1)
            startActivity(myIntent)
        }
        else
        {
            var player1=findViewById<EditText>(R.id.Value1)
            var name1=player1.text.toString()
            var player2=findViewById<EditText>(R.id.Value2)
            var name2=player2.text.toString()
            var myIntent=Intent(this,Game::class.java)
            myIntent.putExtra("player1",name1)
            myIntent.putExtra("player2",name2)
            myIntent.putExtra("player",2)
            startActivity(myIntent)
        }
    }

}