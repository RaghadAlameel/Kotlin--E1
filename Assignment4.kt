package com.example.firstproject

fun main(){
    var result = math(1.0,"+",1.0)
    println("""
        The result is : $result
    """.trimIndent())
}
fun math (num1 : Double, op : String ="+", num2 : Double) : Double
{
    var result : Double = 0.0
    when (op) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> result = num1 / num2
        else -> println("Wrong operation, try again")
    }
    return result
}