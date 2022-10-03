package com.example.firstproject

fun main() {
    val exc1 : Boolean = false
    val exc2 : Boolean = false
    val exc3 : Boolean = true
    val exc4  = exc1 && exc2
    val exc5  = exc1 || exc3
    val num1 : Double = 10.0
    val num2 : Double = 3.0
    var result1 : Double = num1%num2
    val num3 : Byte = 5
    val num4 : Byte = 5
    var result2 : Boolean = num3 >= num4
    var result3 = 5-3*2
    var result4 = 3!=2
    var result5 = (6+6)/3


    println("Results are: ")
    println(""+ exc4 + "\n" + result1 + "\n" + result2
            +"\n"+exc5+"\n"+result3+"\n"+result4+"\n"+result5)
}