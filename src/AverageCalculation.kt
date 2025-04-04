package com.example.tutorialseu_arraylists

fun main(){
    val numb1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Average of number 1 is ${calculateAverage(numb1)}")
    val numb2 = listOf(10, 20, 30, 40, 50)
    println("Average of number 2 is ${calculateAverage(numb2)}")
    val numb3 = listOf<Int>()
    println("Average of number 3 is ${calculateAverage(numb3)}")
}

fun calculateAverage(numbers: List<Int>): Double{
    if (numbers.isEmpty())
    return 0.0 //To avoid division by zero
    val totalSum = numbers.sum()
    return totalSum.toDouble()/numbers.size //Need to convert one of them to Double to avoid integer division.
}