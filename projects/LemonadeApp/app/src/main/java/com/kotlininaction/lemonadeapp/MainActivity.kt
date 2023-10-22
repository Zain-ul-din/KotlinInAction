package com.kotlininaction.lemonadeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    /*
        Entry Point
     */
    private fun init ()
    {
        val tasks = Tasks(this)

        // grabbing ref
        val taskImgRef: ImageView = findViewById(R.id.img_holder)
        val taskTxtRef: TextView = findViewById(R.id.task_txt_holder)

        taskImgRef.setOnClickListener {
            val task = tasks.getNextTask()
            taskTxtRef.text = task.name;
            taskImgRef.setImageResource(task.imgRes);
        };
    }
}
