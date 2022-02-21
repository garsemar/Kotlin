package cat.itb.martigarcia7e4.dam.m03.uf2.recursivity

import java.util.*

fun fig(num: Int): Int{
    if(num != 0){
        return 1 + fig(num/10)
    }
    return 0
}

fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()
    println(fig(num))
}