package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun readIntList(): MutableList<Int> {
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    var num = scan.nextInt()

    while(true){
        if(num == 0){
            break
        }
        val nums = scan.nextInt()
        list.add(nums)
        num--
    }
    return list
}

fun main(){
    readIntList()
}