package com.example.tutorialseu_arraylists

fun main(){
    var circleRatio = 3.14 //First variable contain a Double so we can compare with the other variables below = 3.14
    println(circleRatio)
    var circleRatio2 = 3.14f //declaring as float number = 3.14
    println(circleRatio2)
    var circleRatio3 = 3.1415926535F //changing for a long float to check the message: floating-point literal cannot be
                                    // represented with the required precision = 3.1415927
    println(circleRatio3)
    var circleRatio4 = 3.1415926535 //changing the number to double to check the print result = 3.1415926535
    println(circleRatio4)
    var circleRatio5 = 3.1415926535897932 //assigning a longer value to compare the print result = 3.141592653589793
    println(circleRatio5)
}