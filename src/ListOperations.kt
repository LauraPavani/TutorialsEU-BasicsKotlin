package com.example.tutorialseu_arraylists

fun main(){
    val fruitList = mutableListOf("Banana", "Apple", "Grape", "Nectarine", "Blueberry", "Blackberry")
    println(fruitList)
    fruitList.add("Strawberry")
    println(fruitList)
    fruitList.remove("Apple")
    println(fruitList)
    val checkNec = fruitList.contains("Nectarine")
    if (fruitList.contains("Nectarine")){
        println("Of course it contains Nectarine. I love it!")
    }else{
        println("I couldn't find in the list your desirable fruit!")
    }
}