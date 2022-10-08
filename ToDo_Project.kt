package com.example.firstproject

fun main() {
    val taskList = Todo()
    var task1 = Task(1,"Sarah","Buy a Car")
    var task2 = Task(2,"Abdulrahman","Travel to NewYork")
    var task3 = Task(3,"Raghad","Spoil my Cat")
    // call functions
    taskList.addTask(task1)
    taskList.addTask(task2)
    taskList.addTask(task3)
    taskList.printTask(2)
    taskList.deleteTask(task2)
    taskList.changeTask(task3)
    taskList.printAllTasks()
}
data class Task (val id:Int, var name : String, var note : String , var isCompleted : Boolean = false)
class Todo
{
    var  tasksList = arrayListOf<Task>()
    fun printAllTasks ()
    {
        println("All Tasks:")
        for(t in tasksList)
        println("""
            Task: ${t.note}
        """.trimIndent())
    }
    fun printTask (task : Int)
    {
        for(t in tasksList)
        {
            if(t.id==task)
            {
                println("""
                    Task Details: ID (${t.id}), Name (${t.name}), Task (${t.note}), Completed(${t.isCompleted})
                """.trimIndent())
            }
        }
    }
    fun addTask( t : Task)
    {
        tasksList.add(t)
        println("Add Task: "+t.note)
    }
    fun deleteTask(t : Task)
    {
        println("Remove Task: " + t.note)
        tasksList.remove(t)
    }
    fun changeTask(t : Task)
    {
        t.isCompleted = !t.isCompleted
        println("""
            Task: ${t.note}, Complete: ${t.isCompleted}
        """.trimIndent())
    }
}

