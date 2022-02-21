package cat.itb.martigarcia7e4.dam.m03.uf2.recursivity

import java.util.*

fun point(num: Int): String {
    if(num == 0){
        return ""
    }
    return "." + point(num-1)
}

fun main(){
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()

    println(point(num))
}