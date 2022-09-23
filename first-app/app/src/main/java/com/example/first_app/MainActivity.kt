package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.dice_button)
        rollButton.setOnClickListener{
            Toast.makeText(this, "diced B)", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val diceValue: TextView = findViewById(R.id.dice_value)
        val randomInt = Random().nextInt(6)+1
        diceValue.text = randomInt.toString()
    }
}