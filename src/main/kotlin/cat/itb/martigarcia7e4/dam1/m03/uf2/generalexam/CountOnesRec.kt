package cat.itb.martigarcia7e4.dam1.m03.uf2.generalexam

import java.util.*

fun cont(num: Int, def: Int): Double {
    if (num != 0){
        val digit = num % 10
        return if (digit == def) 1 + cont(num / 10, def) else cont(num / 10, def)
    }
    return 0.0
}

fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()
    println(cont(num, 1).toInt())
}