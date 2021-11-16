package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val llista = mutableListOf<String>()
    var numCan = 0
    print("Introdueix el numero de candidats: ")
    val num = scan.nextInt()
    for(i in 1..num){
        val candidats = scan.next()
        llista.add(candidats)
    }
    println(llista)
    while(true){
        numCan = scan.nextInt()
        if(numCan == -1){
            break
        }
        println(llista[numCan-1])
    }
}