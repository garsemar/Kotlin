package cat.itb.martigarcia7e4.dam.m03.uf2.functions

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val list = readIntList(scan)
    println("Hi ha hagut ${countTotalCases(list)} casos en total.")
    println("L'útlim creixement és de ${growthRates(list).last()}")
    println("La mitjana de creixement és de ${growthRates(list).average()}")
}