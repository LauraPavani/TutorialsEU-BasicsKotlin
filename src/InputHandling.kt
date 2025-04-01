package com.example.tutorialseu_arraylists

fun main(){

    val multiplier = 5

    println("Please enter a number to multiply by 5 :")

    //read what the user has entered into the console
    val inputString = readln()

    //if statement to check if the user added an Integer number
    if (inputString.all { it.isDigit() }) {
        //convert the string to integer
        val inputNumber = inputString.toInt()
        println(println("The result of $inputNumber x 5 is ${inputNumber * multiplier}"))
    }else{
        println("Please enter a valid integer number")
    }
}