package com.example.tutorialseu_arraylists

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int)

fun main() {
    /*
    //Creating an object/instance of the class Dog
    var maze = Dog("Maze", "Chow-Chow", 5)
    println("${maze.name} is a ${maze.breed} and it is ${maze.age} years old")
    println("A year has passed...")
    maze.age = 6
    println("${maze.name} is a ${maze.breed} and it is ${maze.age} years old")
}
*/
    val coffeeForLaura = CoffeeDetails(0, "Laura", "jumbo", 2)
    makeCoffee(coffeeForLaura)
}

fun askCoffeeDetails(){
    //check who the coffee is for manually
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    //Call the function
    //makeCoffee( sugarCountInt, name)
}

//Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails){
// IF statement to fix the spelling of spoon when one spoon of sugar is selected
    if (coffeeDetails.sugarCount == 1){
        println("${coffeeDetails.size} coffee size with 1 spoon of sugar and cream amount as ${coffeeDetails.creamAmount} for ${coffeeDetails.name}")
    }else if(coffeeDetails.sugarCount == 0){
        println("${coffeeDetails.size} coffee size with no sugar and cream amount as ${coffeeDetails.creamAmount} for ${coffeeDetails.name}")
    }else{
        println("${coffeeDetails.size} coffee size with ${coffeeDetails.sugarCount} spoons of sugar and cream amount as ${coffeeDetails.creamAmount} for ${coffeeDetails.name}")
    }
}

//A class is a template for creating objects.
//Objects are instances of classes, where the class defines certain attributes (properties) and
// behaviors (functions/methods) that its objects will have.
//A basic class definition looks like this:
/*
class ClassName {
    class body
}
 */

//Key Concepts and Terminologies: Exploring Basic Kotlin Syntax
//Constructor: A special function used to initialize the properties of an object when it’s created. It’s declared in the class header.
//Properties: Variables that are defined in the class to hold some data. They represent the state of an object.
//Initializers: Code blocks that run when an object is instantiated, used to set up initial states.
//Objects/Instance: An individual instance created from the class, holding specific data in its properties.