package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roller_Button)
        rollButton.text="Let's Roll ! "
        rollButton.setOnClickListener {
            diceRoll()
            Toast.makeText(this,"yayyy",Toast.LENGTH_SHORT).show()
        }

    }

    private fun diceRoll() {

        var randomInt=java.util.Random().nextInt(6)+1
        val text:TextView=findViewById(R.id.text_result)
        text.text=randomInt.toString()
    }
}