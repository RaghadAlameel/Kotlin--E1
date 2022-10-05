package com.example.firstproject

fun main(){
    var numbers = arrayListOf <Double>()
    var newNumber :Double =0.0
    for(n in 1..5) {
        newNumber++
        numbers.add(newNumber) }

    var avg :Double = numbers.average()

    println("""
        The array elements:
        $numbers
        The average of the elements:
        $avg
    """.trimIndent())
}