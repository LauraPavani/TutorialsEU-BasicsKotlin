package com.example.tutorialseu_arraylists

class Offspring : SecondaryClassInheritance(), Archer, Singer {
    override fun archery() {
        super.archery()
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }
}