package com.kotlininaction.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.kotlininaction.tipcalculator.databinding.ActivityMainBinding
import java.util.zip.Inflater
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ratingMap: Map<Int, Double>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    /**
     * Entry Point
     */
    private fun init ()
    {
        ratingMap = mapOf(
            R.id.amazing to 0.2,
            R.id.good to 0.18,
            R.id.okay to 0.15
        )

        binding.generatedBtn.setOnClickListener {
            calculateTip()
        }
    }

    private fun calculateTip ()
    {
        val inputCost: Double =  (binding.costInput.text.toString().toDoubleOrNull() ?: 0.0) *
                (ratingMap[binding.tipSelection.checkedRadioButtonId] ?: 1.0)

        binding.tipAmount.text = buildString {
            append("tip: ")
            append(
                when(binding.roundSwitch.isChecked) {
                    true -> inputCost.toInt().toString()
                    false -> inputCost.toFloat().toString()
                }
            )
            append(" pkr")
        }
    }
}
