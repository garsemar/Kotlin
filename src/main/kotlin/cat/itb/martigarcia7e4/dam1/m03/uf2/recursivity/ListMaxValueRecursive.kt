package cat.itb.martigarcia7e4.dam1.m03.uf2.recursivity

import java.util.*

fun listM(list: MutableList<Int>): Int{
    if(list.isEmpty()){
        return 0
    }
    if(list.indices == 0..0){
        return list[0]
    }
    if(list[0] > list[1]){
        list.removeAt(1)
    }
    else if(list[0] < list[1]){
        list.removeAt(0)
    }
    return listM(list)
}

fun main() {
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while(true){
        val num = scan.nextInt()
        if(num == -1) break
        list.add(num)
    }
    println(listM(list))
}