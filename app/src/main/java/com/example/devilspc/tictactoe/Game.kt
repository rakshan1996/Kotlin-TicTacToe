package com.example.devilspc.tictactoe

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast

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

     fun play(view:View)
     {
        var buSelected=view as TextView
         var cellId=0
         when (buSelected.id)
         {
             R.id.Box1->cellId=1
             R.id.Box2->cellId=2
             R.id.Box3->cellId=3
             R.id.Box4->cellId=4
             R.id.Box5->cellId=5
             R.id.Box6->cellId=6
             R.id.Box7->cellId=7
             R.id.Box8->cellId=8
             R.id.Box9->cellId=9

         }
         Toast.makeText(this,"cellid selected" +cellId,Toast.LENGTH_SHORT).show()
     }


}