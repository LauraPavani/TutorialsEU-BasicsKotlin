package com.example.tutorialseu_arraylists

/* I've refactored the code using in operator for a range to learn different ways to create the same result.

fun main(){
    println("Enter your age as a whole number: ")
    val enteredValue = readln()

    var age = enteredValue.toInt()
    if(age >= 18 && age <= 40){
        println("You can enter to the club.")
    }else if(age >= 40){
            println("You cannot go into the club, please go home.")
    }else{
        println("Age not verified. Please contact support")
    }
}
*/
fun main(){
    println("Enter your age as a whole number: ")
    val enteredValue = readln()

    var age = enteredValue.toInt()
    if(age in 18 .. 39){
        println("You can enter to the club.")
    }else if(age >= 40){
        println("You cannot go into the club, please go home.")
    }else{
        println("Age not verified. Please contact support")
    }
}