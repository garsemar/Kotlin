package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while(true){
        val num = scan.nextInt()
        if(num == -1){
            break
        }
        list.add(num)
    }
    print(list.reversed())
}