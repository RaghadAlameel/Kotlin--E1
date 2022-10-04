package com.example.firstproject

fun main() {
    var temp = 35
    while (temp <=35)
    {
        when(temp)
        {
            30 -> println("The temperature is: $temp - It's Hot!")
            20 -> println("The temperature is: $temp - It's Comfy")
            15 -> println("The temperature is: $temp - It's Cold")
            9 -> break
            else -> println("The temperature is: $temp")
        }
        temp--
    }
}