package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import javax.xml.transform.Result
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var  button: Button
   lateinit var  image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            button=findViewById(R.id.button_roll)
            image=findViewById(R.id.image_Dice)
        button.setOnClickListener{
            rollDice()

        }
    }

    private fun rollDice() {
        val randomNumber: Int = Random.nextInt(6) + 1
        val drawableResult = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image.setImageResource(drawableResult)
    }}