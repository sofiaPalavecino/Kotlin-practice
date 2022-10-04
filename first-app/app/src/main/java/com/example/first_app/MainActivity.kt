package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.dice_button)
        rollButton.setOnClickListener{
            Toast.makeText(this, "diced B)", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val diceValue: TextView = findViewById(R.id.dice_value)
        val randomInt = Random().nextInt(6)+1
        changeDiceImage(randomInt)
        diceValue.text = randomInt.toString()
    }

    private fun changeDiceImage(diceNumber: Int) {
        val drawableResource = when (diceNumber) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}