package com.example.tutorialseu_arraylists

fun main(){
    //Call the function
    makeCoffee(1)
    makeCoffee(2)
    makeCoffee(30)

}

//Define Function
fun makeCoffee(sugarCount: Int){
// IF statement to fix the spelling of spoon when one spoon of sugar is selected
    if (sugarCount == 1){
        println("Coffee with 1 spoon of sugar")
    }else{
        println("Coffee with $sugarCount spoons of sugar")
    }
}