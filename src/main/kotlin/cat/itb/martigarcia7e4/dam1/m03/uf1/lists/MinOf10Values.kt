package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    var fir = 11

    for(i in 1..10){
        val num = scan.nextInt()
        list.add(num)
    }
    /* 1
    list.forEach {
        if(fir > it){
            fir = it
        }
    }
    println(fir)
     */

    // 2
    list.sort()
    print(list.first())
}