package cat.itb.martigarcia7e4.dam.m03.uf2.classfun

import cat.itb.martigarcia7e4.dam.m03.uf1.data.project.scan
import java.util.*

class ThreeInARow{
    private val matrix = MutableList(3){MutableList(3){"."}}
    private val playerX = Players("x")
    private val playery = Players("0")
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
            val listY = playery.inputTable(matrix)
            matrix[listX[0]][scan.nextInt()] = "X"
            matrix[scan.nextInt()][scan.nextInt()] = "0"
        }
    }
    /*private fun check(){
        for(i in matrix.indices){
            for(j in matrix.indices){

            }
        }
    }*/
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