package com.example.tutorialseu_arraylists

fun main(){
    //Call the function
    makeCoffee(0, "Eduardo")
    makeCoffee(1, "Lucelia")
    makeCoffee(2, "Jimmy")
    makeCoffee(30, "Lucinda")

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