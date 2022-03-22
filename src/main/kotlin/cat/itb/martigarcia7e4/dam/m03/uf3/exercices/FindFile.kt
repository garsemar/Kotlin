package cat.itb.martigarcia7e4.dam.m03.uf3.exercices

import java.util.*

class FindFile(var hola: Int){
    val xd = 2 + hola
}

fun main() {
    val scan = Scanner(System.`in`)
    val file = scan.next()
    val findFile = FindFile(2)
    println(findFile.xd)
    findFile.hola = 5
    println(findFile.xd)

}