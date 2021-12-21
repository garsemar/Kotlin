package cat.itb.martigarcia7e4.dam.m03.uf1.generalexam

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    var equip0 = 0
    var equip1 = 0
    repeat(50){
        list.add(scan.nextInt())
    }
    for(i in 0..list.lastIndex){
        if(i%10 == 0){
            equip0 += list[i]
        }else if(i%10 == 1){
            equip1 += list[i]
        }
    }
    println(equip0)
    println(equip1)
}