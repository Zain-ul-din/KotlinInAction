package com.kotlininaction.lemonadeapp

import android.content.Context

/**
    * manages tasks
    *
    `USAGE:`
    ```kotlin
        var tasks = Tasks();
        task.getCurrTask() // returns current task
        task.getNextTask() // returns next task and also move iterator to next
    ```
 */
class Tasks(private val context: Context)
{
    /**
        List of task
        * simply add new task by providing task name and image from resources
     */
    private val tasks = arrayOf(
        Task(getStrFromRes(R.string.task_1), R.drawable.lemon_tree),
        Task(getStrFromRes(R.string.task_2), R.drawable.lemon_squeeze),
        Task(getStrFromRes(R.string.task_3), R.drawable.lemon_drink),
        Task(getStrFromRes(R.string.task_4), R.drawable.lemon_restart)
    )

    /**
        Helper to load string from resources
     */
    private fun getStrFromRes(resId: Int): String
    {
        return context.getString(resId)
    }

    /**
        index to track current task
     */
    private var currTaskIdx: Int = 0

    /**
     * returns next task. serves task as circular list way
     */
    fun getNextTask(): Task
    {
        this.currTaskIdx = (this.currTaskIdx + 1) % this.tasks.size;
        return this.tasks[this.currTaskIdx];
    }

    /**
     * returns current task
     */
    fun getCurrTask(): Task
    {
        return this.tasks[this.currTaskIdx];
    }
}