package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val listJ = mutableListOf<Int>()
    var a = 1

    while(a <= 5){
        print("Introdueix un jugador: ")
        val pos = scan.nextInt()
        listJ.add(pos)
        a += 1
    }
    println(listJ)
}