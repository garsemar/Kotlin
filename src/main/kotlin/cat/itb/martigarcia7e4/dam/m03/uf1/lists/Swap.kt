package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()

    for(i in 1..4){
        val num = scan.nextInt()
        list.add(num)
    }
    val first = list.first()
    list[0] = list[3]
    list[3] = first

    println(list)
}