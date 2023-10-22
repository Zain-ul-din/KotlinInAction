package com.kotlininaction.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    /**
        entry point
    */
    private fun init ()
    {
        val rollBtnRef: Button = findViewById(R.id.roll_btn)
        val diceImgRef: ImageView = findViewById(R.id.dice_img)

        rollBtnRef.setOnClickListener {
            when(rollDice()) {
                1 -> diceImgRef.setImageResource(R.drawable.dice_1)
                2 -> diceImgRef.setImageResource(R.drawable.dice_2)
                3 -> diceImgRef.setImageResource(R.drawable.dice_3)
                4 -> diceImgRef.setImageResource(R.drawable.dice_4)
                5 -> diceImgRef.setImageResource(R.drawable.dice_5)
                6 -> diceImgRef.setImageResource(R.drawable.dice_6)
            }
        };
    }
    
    /**
        @returns random value between 1 to 6
        since standard dice has only 6 sides that's why 'numside' argument is not required
    */
    private fun rollDice (): Int
    {
        return (1..6).random();
    }
}


