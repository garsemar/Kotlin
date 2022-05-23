package cat.itb.martigarcia7e4.dam.m03.uf5.exercices.regex

import java.util.*

data class Stats(var white: Int, var black: Int)

fun main() {
    val scan = Scanner(System.`in`)

    val text = "<><<>><(<)"
    val combos = Regex("[(][)]|<>|<..>|[(]..[)]")
    val matches = combos.findAll(text)
    val names: Sequence<List<String>> = matches.map { it.groupValues }

    val stats = Stats(0, 0)
    for(i in names){
        var comb = i.toString()
        comb = comb.dropLast(1)
        comb = comb.substring(1)
        if(comb == "<>"){
            stats.white += 1
        }
        else if(comb == "()"){
            stats.black += 1
        }
        else if(comb == "<<>>"){
            stats.white += 2
        }
        else if(comb == "(())"){
            stats.black += 2
        }
        else if(comb == "<()>" || comb == "(<>)"){
            stats.white += 1
            stats.black += 1
        }
    }
    println("${stats.white}b ${stats.black}n")
}