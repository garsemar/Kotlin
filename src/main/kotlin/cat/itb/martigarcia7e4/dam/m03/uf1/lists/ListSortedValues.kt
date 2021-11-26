package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()
    val list = mutableListOf<Int>()
    var ord = 0

    for(i in 1..num){
        list.add(scan.nextInt())
    }
    for(i in 1..list.size){
        if(ord <= list[i-1]){
            ord = list[i-1]
        }else{
            print("Desordenats")
            break
        }
    }
    if(ord == list.last()){
        println("ordenats")
    }
}