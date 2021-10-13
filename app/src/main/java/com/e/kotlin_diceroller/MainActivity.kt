package com.e.kotlin_diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button =findViewById(R.id.rollButton)
        rollbutton.setOnClickListener {
           rollDice()
        }
    }

    private fun rollDice() {

        val diceRoll = (1..6).random()
        val resultTextView: TextView = findViewById(R.id.rollNum)
        resultTextView.text = diceRoll.toString()
    }
}