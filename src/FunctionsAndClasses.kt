package com.example.tutorialseu_arraylists

fun main(){
    //check who the coffee is for manually
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    //Call the function
    makeCoffee(sugarCountInt, name)
}

//Define Function
fun makeCoffee(sugarCount: Int, name: String){
// IF statement to fix the spelling of spoon when one spoon of sugar is selected
    if (sugarCount == 1){
        println("Coffee with 1 spoon of sugar for $name")
    }else if(sugarCount == 0){
        println("Coffee with no sugar for $name")
    }else{
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}