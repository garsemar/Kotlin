package cat.itb.martigarcia7e4.dam1.m03.uf2.functions

import java.util.*

class IntegerLists(var list: MutableList<Int>){
    fun min(list: List<Int>): Int{
        var low = list[0]
        for(i in list.indices){
            if(list[i] < low){
                low = list[i]
            }
        }
        return low
    }
}

fun main(){
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while(true){
        val si = scan.nextInt()
        if(si == -1)break
        list.add(si)
    }
    val minN = IntegerLists(list)
    println("El producte més econòmic val: ${minN.min(list)}€")
}