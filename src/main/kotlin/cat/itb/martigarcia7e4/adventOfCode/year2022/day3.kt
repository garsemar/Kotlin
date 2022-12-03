package cat.itb.martigarcia7e4.adventOfCode.year2022

import java.io.File

val dictionary = mutableMapOf<Char, Int>()
val scoreList = mutableListOf<Int>()

fun main() {
    val file = File("src/main/resources/adventOfCode/input3.txt").readLines().map { it.chunked(it.length/2) }
    createPriority()
    file.forEach{
        part1(it)
    }
    println(scoreList.sum())
}

fun part1(file: List<String>){
    val usedLetters = mutableListOf<Char>()
    for(i in file.indices){
        for(j in file[i]){
            if(i == 0 && j in file[i+1]){
                if(j !in usedLetters){
                    scoreList.add(dictionary[j]!!)
                    usedLetters.add(j)
                }
            }
        }
    }

    // println(file.groupingBy { it }.eachCount().filter { it.value > 1 })
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