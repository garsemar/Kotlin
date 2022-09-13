package cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.regex

import java.util.*

data class Stats(var white: Int, var black: Int)

fun main() {
    val scan = Scanner(System.`in`)

    val text = "(())<><()>"
    val combos = Regex("[(][)]|<>|<..>|[(]..[)]")
    val names = combos.findAll(text).map { it.value }

    val stats = Stats(0, 0)
    names.forEach {
        when(it){
            "<>" -> stats.white++
            "()" -> stats.black++
            "<<>>" -> stats.white += 2
            "(())" -> stats.black += 2
            "<()>", "(<>)" -> {
                stats.white += 1
                stats.black += 1
            }
        }
    }
    println("${stats.white}b ${stats.black}n")
}