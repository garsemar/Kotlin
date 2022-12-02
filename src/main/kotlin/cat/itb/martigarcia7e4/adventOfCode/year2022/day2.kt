package cat.itb.martigarcia7e4.adventOfCode.year2022

import java.io.File

val winPoints = mapOf("win" to 6, "draw" to 3, "loss" to 0)

var score = 0

fun main() {
    // A for Rock, B for Paper, and C for Scissors.
    // X for Rock, Y for Paper, and Z for Scissors.
    /*
    1 for Rock, 2 for Paper, and 3 for Scissors
    0 lost, 3 draw, 6 won

    A X
A Y
A Z
B X
B Y
B Z
C X
C Y
C Z
     */
    val file = File("src/main/resources/adventOfCode/input2.txt")

    val points = mapOf("A" to 1, "B" to 2, "C" to 3, "X" to 1, "Y" to 2, "Z" to 3)

    val lines = file.readLines()
    val defList = MutableList(lines.size) { listOf<String>() }
    for(i in lines.indices){
        defList[i] = lines[i].split(" ")
    }
    for(i in defList.indices){
        checkWin(listOf(points[defList[i][0]], points[defList[i][1]]))
    }

    println(score)
}

fun checkWin(play: List<Int?>){
    println(play)
    if(play[0]!! == 3 && play[1]!! == 1){
        addScore(play[1]!!, "win")
    }
    else if(play[0]!! == 1 && play[1]!! == 3){
        addScore(play[1]!!, "loss")
    }
    else if(play[0]!! < play[1]!!){
        addScore(play[1]!!, "win")
    }
    else if(play[0]!! == play[1]!!) {
        addScore(play[1]!!, "draw")
    }
    else{
        addScore(play[1]!!, "loss")
    }
}

fun addScore(points: Int, status: String) {
    score += points+winPoints[status]!!
    println(status)
}