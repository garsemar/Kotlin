package cat.itb.martigarcia7e4.dam1.m03.uf2.functions

import java.util.*
fun readIntList(scanner: Scanner):List<Int>{
    val list = mutableListOf<Int>()
    while(true){
        val si = scanner.nextInt()
        if(si == -1)break
        list.add(si)
    }
    return list
}

fun main() {
    val scan = Scanner(System.`in`)
    println(readIntList(scan))
}
