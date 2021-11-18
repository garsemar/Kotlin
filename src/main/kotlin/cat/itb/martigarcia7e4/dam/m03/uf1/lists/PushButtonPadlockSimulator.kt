package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = MutableList(8){"false"}

    while(true){
        val num = scan.nextInt()
        if(num == -1){
            break
        }
        if(list[num] != "true"){
            list[num] = "true"
        }else{
            list[num] = "false"
        }
    }
    println(list)
}