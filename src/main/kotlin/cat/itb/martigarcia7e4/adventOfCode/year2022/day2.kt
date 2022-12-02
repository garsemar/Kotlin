package cat.itb.martigarcia7e4.adventOfCode.year2022

import java.io.File

val winPoints = mapOf("win" to 6, "draw" to 3, "loss" to 0)

val winCondition = mapOf("X" to "loss", "Y" to "draw", "Z" to "win")

val points = mapOf("A" to 1, "B" to 2, "C" to 3, "X" to 1, "Y" to 2, "Z" to 3)

var score = 0

fun main() {
    // A for Rock, B for Paper, and C for Scissors.
    // X for Rock, Y for Paper, and Z for Scissors.
    /*
    1 for Rock, 2 for Paper, and 3 for Scissors
    0 lost, 3 draw, 6 won
    X lose, Y draw, Z win
     */
    val file = File("src/main/resources/adventOfCode/input2.txt").readLines().map { it.split(" ") }

    for(i in file.indices){
        checkWin(listOf(points[file[i][0]], points[file[i][1]]))
    }

    println(score)

    secondScore(file)
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
}

fun secondScore(defList: List<List<String>>){
    score = 0
    var status = ""
    for(i in defList.indices){
        status = winCondition[defList[i][1]].toString()
        when(status){
            "win" -> win(listOf(points[defList[i][0]], points[defList[i][1]]))
            "loss" -> loss(listOf(points[defList[i][0]], points[defList[i][1]]))
            "draw" -> draw(listOf(points[defList[i][0]], points[defList[i][1]]))
        }
    }
}

fun win(list: List<Int?>){
    score += if(list[0] != 3){
        (list[0]!!+1)+6
    }
    else{
        1+6
    }
}

fun loss(list: List<Int?>){
    score += if(list[0] != 1){
        (list[0]!!-1)+0
    }
    else{
        3+0
    }
}

fun draw(list: List<Int?>){
    score += list[0]!!+3
}