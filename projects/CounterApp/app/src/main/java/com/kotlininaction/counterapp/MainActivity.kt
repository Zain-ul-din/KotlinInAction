package com.kotlininaction.counterapp

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlininaction.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    /**
     * entry point
     */
    private fun init ()
    {
        binding.counterBtn.setOnClickListener {
            counter += 1;
            updateCounterTxt()
        }

        binding.resetBtn.setOnClickListener {
            counter = 0;
            updateCounterTxt()
        }
    }

    private fun updateCounterTxt ()
    {
        binding.counterTxt.text = counter.toString();
    }
}
