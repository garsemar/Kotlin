package cat.itb.martigarcia7e4.dam1.m03.uf2.classfun

import cat.itb.martigarcia7e4.dam1.m03.uf1.data.project.scan
import java.util.*

class ThreeInARow{
    private val matrix = MutableList(3){MutableList(3){"."}}
    private val playerX = Players("X")
    private val playerY = Players("0")
    fun printTauler(){
        for(i in matrix.indices){
            for(j in matrix.indices){
                print(matrix[i][j]+" ")
            }
            println(" ")
        }
    }
    fun input(){
        while(true) {
            val listX = playerX.inputTable(matrix)
            matrix[listX[0]][listX[1]] = "X"
            printTauler()
            check(playerX)
            val listY = playerY.inputTable(matrix)
            matrix[listY[0]][listY[1]] = "0"
            printTauler()
            check(playerY)
        }
    }
    private fun check(play: Players){
        for(i in matrix.indices){
            if(matrix[i][0] == play.type && matrix[i][1] == play.type && matrix[i][2] == play.type){
                println("guanyen les ${play.type}")
            }
        }
    }
}
data class Players(val type: String){
    fun inputTable(matrix: MutableList<MutableList<String>>): List<Int>{
        var list = listOf(scan.nextInt(), scan.nextInt())
        while(!check(list, matrix)){
            list = listOf(scan.nextInt(), scan.nextInt())
        }
        return list
    }
    private fun check(list: List<Int>, matrix: MutableList<MutableList<String>>): Boolean {
        if(matrix[list[0]][list[1]] == "."){
            return true
        }
        return false
    }
}

fun main(){
    val scan = Scanner(System.`in`)
    val threeInARow = ThreeInARow()
    threeInARow.printTauler()
    threeInARow.input()
}