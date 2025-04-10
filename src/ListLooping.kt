package com.example.tutorialseu_arraylists

fun main(){
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6)

    println("The original list is $numbers")

    for (index in 0 until numbers.size) {
        numbers[index] = numbers[index] * 2
    }
    println("Doubling every item on the list $numbers")
}