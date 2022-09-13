package cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.regex

import java.util.*

fun main() {
    val text = listOf('r','o','t','o','r')
    val pila = Stack<Char>()
    val cua = mutableListOf<Char>()
    for (myCaracter in text) {
        pila.push(myCaracter)
        cua.add(myCaracter)
    }
    println("Pila: $pila")
    println("Cua: $cua")

    val b: Boolean = esPalindrom(pila, cua)
    println(b)
}

fun esPalindrom(pila: Stack<Char>, cua: List<Char>): Boolean {
    if(pila == cua.reversed()){
        return true
    }
    return false
}