package cat.itb.martigarcia7e4.adventOfCode.year2022

import java.io.File

fun main() {
    val file = File("src/main/resources/adventOfCode/input5.txt").readText().split("\n\n").map { it.split("\n") }

    file[0].forEach {
        //val map = mutableListOf(it[0], it[1], it[2]).map { it.windowed(3, 4) }
    }

    println(file)

}