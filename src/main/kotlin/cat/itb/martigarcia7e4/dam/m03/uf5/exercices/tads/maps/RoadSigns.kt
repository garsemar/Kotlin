package cat.itb.martigarcia7e4.dam.m03.uf5.exercices.tads.maps

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val map = mutableMapOf<Int, String>()

    repeat(scan.nextInt()){
        map[scan.nextInt()] = scan.next()
    }

    repeat(scan.nextInt()){
        val res = map[scan.nextInt()] ?: "No hi ha cartell"

        println(res)
    }
}