package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun readList(): MutableList<Float> {
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Float>()
    var num = 10

    while(true){
        if(num == 0){
            break
        }
        val nums = scan.nextFloat()
        list.add(nums)
        num--
    }
    return list
}

fun main() {
    val list2 = mutableListOf<Float>()
    val list = readList()

    for(i in 1..list.size){
        list2.add(list[i-1] + (21*list[i-1])/100)
        println(list[i-1].toString()+" IVA = "+list2[i-1])
    }
}