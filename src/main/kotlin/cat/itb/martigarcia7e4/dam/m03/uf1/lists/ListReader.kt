package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun readIntList(): MutableList<Int> {
    print("Introdueix el numero d'elements del a llista: ")
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    var num = scan.nextInt()

    while(true){
        if(num == 0){
            break
        }
        println("Introdueix el valors de la llista:")
        val nums = scan.nextInt()
        list.add(nums)
        num--
    }
    return list
}

fun main(){
    readIntList()
}