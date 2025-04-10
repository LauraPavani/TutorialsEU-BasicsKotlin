package com.example.tutorialseu_arraylists


class Book(
    val title: String = "Unknown",
    val author: String = "Anonymous",
    val yearPublished: Int = 2025)

fun main(){
    val myBook = Book()
    println("Pre defined values: ")
    println("The title of the book is ${myBook.title}")
    println("The author of the book is ${myBook.author}")
    println("The year published is ${myBook.yearPublished}")

    val customBook = Book("Laura's new career", "Laura", 2025)
    println("Customised values: ")
    println("The title of the book is ${customBook.title}")
    println("The author of the book is ${customBook.author}")
    println("Year the book was published is ${customBook.yearPublished}")
}