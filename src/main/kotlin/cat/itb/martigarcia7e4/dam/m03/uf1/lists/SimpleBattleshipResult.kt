package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val matrix = listOf(
        listOf("x", "x", "0", "0", "0", "0", "x"),
        listOf("0", "0", "x", "0", "0", "0", "x"),
        listOf("0", "0", "0", "0", "0", "0", "x"),
        listOf("0", "x", "x", "x", "0", "0", "x"),
        listOf("0", "0", "0", "0", "x", "0", "0"),
        listOf("0", "0", "0", "0", "x", "0", "0"),
        listOf("x", "0", "0", "0", "0", "0", "0")
    )
    val posX = scan.nextInt()
    val posY = scan.nextInt()
    if(matrix[posX][posY] == "x"){
        println("tocat")
    }else{
        println("aigua")
    }
}