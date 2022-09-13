package cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val meters = mutableListOf<Int>()
    repeat(scanner.nextInt()) {
        meters.add(scanner.nextInt())
    }
    val centimeters = meters.map { it*100 }

    centimeters.forEach { println(it) }
}