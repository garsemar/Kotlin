package cat.itb.martigarcia7e4.dam.m03.uf1.generalexam

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    val tickets = scan.nextInt()
    var len = scan.nextInt()
    var j = 0

    while(len != 0){
        list.add(scan.nextInt())
        len--
    }
    for(i in 0..list.lastIndex){
        if(j == tickets){
            println("Hi ha $tickets seients consecutius")
            break
        }
        if(list[i] == 0) j++
        else j = 0
    }
    if(j != tickets){
        println("No hi ha $tickets seients consecutius")
    }
}