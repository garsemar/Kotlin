package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()

    repeat(10){
        val num = scan.nextInt()
        list.add(num)
    }
    println(list.reversed())
}