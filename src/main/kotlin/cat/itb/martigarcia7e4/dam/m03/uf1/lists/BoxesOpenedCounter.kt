package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = MutableList(11){0}

    while(true){
        val num = scan.nextInt()
        if(num == -1){
            break
        }
        list[num] += 1
    }
    print(list)
}