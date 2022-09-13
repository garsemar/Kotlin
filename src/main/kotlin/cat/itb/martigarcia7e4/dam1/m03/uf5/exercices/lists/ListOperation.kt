package cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.lists

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val intList = mutableListOf<Int>()
    repeat(scan.nextInt()){
        intList.add(scan.nextInt())
    }

    intList.filter { it % 10 != 3 }.sortedByDescending {it}.forEach { println(it) }
}