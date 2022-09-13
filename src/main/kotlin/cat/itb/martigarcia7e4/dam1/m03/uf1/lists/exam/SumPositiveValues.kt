package cat.itb.martigarcia7e4.dam1.m03.uf1.lists.exam

import java.util.*

fun listReader(): MutableList<Int> {
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    print("Introdueix la llargaria de la llista: ")
    var num = scan.nextInt()

    println("Introdueix els numeros de la llista:")
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
    var res = 0
    val list = listReader()
    for(i in 1..list.size){
        if(list[i-1] >= 0){
            res += list[i-1]
        }
    }
    println(res)
}