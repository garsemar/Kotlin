package cat.itb.martigarcia7e4.dam1.m03.uf1.nuls

import java.util.*

fun IntList(): MutableList<Int> {
    val scan = Scanner(System.`in`)
    print("Introdueix el numero d'elements de la llista: ")
    var a = scan.nextInt()
    val list = mutableListOf<Int>()
    println("Introdueix els elements de la llista:")
    while(a >= 1){
        val num = scan.nextInt()
        list.add(num)
        a--
    }
    return list
}

fun main(){
    val list = IntList()
    print(list)
}