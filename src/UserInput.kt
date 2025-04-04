package com.example.tutorialseu_arraylists

fun main(){
    println("Enter the first number: ")
    val numInp1 = readln()
    val num1Int = numInp1.toInt()
    println("Enter the second number: ")
    val numinp2 = readln()
    val num2Int = numinp2.toInt()

    //val myResult = add(num1Int, num2Int)
    val myResult = divide(num1Int, num2Int)
    println("The result of $num1Int + $num2Int is $myResult")
}

fun add (num1: Int, num2: Int): Int{
    val result = num1 + num2
    return result
}

//The problem with Integers is that it cuts off when a double result happens.
//There are two ways to fix it, one is like below adding another line in the main function with the
//val to read the divide method, and the other would be change the '.toInt()' for
//'.toDouble' and change the 'Int' in the add method to Double.
fun divide(num1: Int, num2: Int):Double{
    val result = num1 / num2.toDouble()
    return result
}