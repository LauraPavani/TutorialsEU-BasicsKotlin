package com.example.tutorialseu_arraylists

//ArrayLists are used to create dynamic arrays and arrays are type of collections. Which means the size of an
//ArrayList can be increased or decreased according to your requirement.
//The ArrayList class provides both read and write functionalities.
//The ArrayList follows the sequence of insertion order.
//An ArrayList is non synchronized and it may contain duplicate elements.

//Constructor of ArrayList
//ArrayList<E>(): Is used to create an empty ArrayList.
//ArrayList (capacity: Int): Is used to create an Array List of specified capacity.
//ArrayList (elements: Collection<E>): Is used to create an ArrayList filled with the elements of a collection

//Functions of ArrayList
// open fun add(element:E): Boolean -> used to add the specific element into the collection.
// open fun clear() -> used to remove all elements from the collection.
// open fun get(index: Int): E -> used to return the element at specified index in the list.
// open fun remove(element: E): Boolean -> used to remove a single instance of the specific element from current collection, if it is available.
// there are of course many more functions in the ArrayList Class.

//Empty ArrayList
/*fun main(){
    val arrayList = ArrayList<String>() //Creating an empty arraylist
    arrayList.add("One")                //Adding an object in arraylist
    arrayList.add("Two")
    arrayList.add("Three")
    println("........print ArrayList.......")
    for (i in arrayList){
        println(i)
    }
}

//ArrayList using collections
fun main(){
    val arrayList:ArrayList<String> = ArrayList<String>(5)
    val list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")
    list.add("Three")

    arrayList.addAll(list)

    println("......printing ArrayList......")

    val itr = arrayList.iterator()

    while(itr.hasNext()){
        println(itr.next())
    }
    println("size of arrayList = "+ arrayList.size)
}*/

//ArrayList - get()
fun main(args: Array<String>){
    val arrayList:ArrayList<String> = ArrayList<String>()
    arrayList.add("Laura")
    arrayList.add("Caroline")
    arrayList.add("Pavani")
    arrayList.add("Tabarin")
    for(i in arrayList){
        println(i)
    }
    println("......arrayList.get(1)......")
    println(arrayList.get(1))
    println("......arrayList.get(3).......")
    println(arrayList.get(3))
}