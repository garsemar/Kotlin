package cat.itb.martigarcia7e4.adventOfCode.year2022

import kotlin.io.path.Path
import kotlin.io.path.readLines

val dictionary = mutableMapOf<Char, Int>()

fun main() {
    val file = Path("src/main/resources/adventOfCode/input3.txt").readLines().map { it.split("").filter { it != "" } }

    createPriority()

    println(part1(file))

    println(part2(file))
}

fun part1(list: List<List<String>>): Int {
    var score = 0
    for(i in list.indices){
        val compoment = Pair(list[i].subList(0, list[i].size/2), list[i].subList(list[i].size/2, list[i].size))
        val repeat = checkRepeat(compoment.first, compoment.second)
        score += dictionary[repeat.first()]!!
    }
    return score
}

fun part2(file: List<List<String>>): Int {
    val badge = file.windowed(3, 3)
    var score = 0
    for(i in badge.indices){
        val common = badge[i][0].intersect(badge[i][1]).intersect(badge[i][2]).single()
        score += dictionary[common.first()]!!
    }
    return score
}

fun checkRepeat(first: List<String>, second: List<String>): String {
    return first.intersect(second).first()
}

fun createPriority(){
    var j = 1
    for(i in 97..122){
        dictionary[i.toChar()] = j
        j += 1
    }
    for(i in 65..90){
        dictionary[i.toChar()] = j
        j += 1
    }
}