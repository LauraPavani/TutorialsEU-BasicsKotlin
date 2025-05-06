package com.example.tutorialseu_arraylists

fun main(){
    var number : Int
    println("Please enter a number")
    try {
        //error prone code you want to execute
        number = readln().toInt()
        println("The user entered the number $number")
    }catch (e : Exception){
        //What should happen when an error occurs
        println("Error: ${e.message}")
    }finally {
        number = 0
    }

}