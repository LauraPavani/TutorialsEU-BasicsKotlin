package com.example.tutorialseu_arraylists

fun main(){
    //Immutable  List - You cannot add items the initialization.
    val shoppingList = listOf("Processor","RAM", "Graphics Card", "SSD")
    //Mutable List - You can add items later and modify.
    val secondShoppingList = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")
    //adding items to the list
    secondShoppingList.add("Cooling System")
    //removing an item from the list
    secondShoppingList.remove("Graphics Card")
    secondShoppingList.add("Graphics Card RTX 4090")
    println(secondShoppingList)
    //remove in a specific item of the list through the index in list
    secondShoppingList.removeAt(2) //return the list without the SSD item
    println(secondShoppingList)
    //add a new item in the specified position
    secondShoppingList.add(2,"Motherboard")
    println(secondShoppingList)
    //Printing out only a particular item of the list
    println(secondShoppingList[3])
    //modifying a particular item in the list
    secondShoppingList[4] = "Graphics Card RX 7800XT"
    println(secondShoppingList)
    secondShoppingList.set(3,"Water Cooling")
    println(secondShoppingList)
    //contains Method

    val hasSSD = secondShoppingList.contains("SSD") //Returns boolean
    if(secondShoppingList.contains("SSD")) {
        println("Has SSD in the list")
    }else{
        println("Has no SSD in the list")
    }
    secondShoppingList.add(2,"SSD")
    println(secondShoppingList)

    val hasSSD2 = secondShoppingList.contains("SSD") //Returns boolean
    if(secondShoppingList.contains("SSD")) {
        println("Has SSD in the list")
    }else{
        println("Has no SSD in the list")
    }
    println(secondShoppingList)

    //for loops is similar to while loops, but they are used to iterate over a range, array, list, or anything iterable.
    for (item in secondShoppingList){
        println(item)
        if (item == "Motherboard"){
            secondShoppingList.removeLast()
            break
        }
    }

    //Now, getting index in a for loop
    println(secondShoppingList.size)
    for (index in 0 until secondShoppingList.size){
        println("The item ${secondShoppingList[index]} is at index $index")

    }
    println(secondShoppingList)

}