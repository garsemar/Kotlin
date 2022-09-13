package cat.itb.martigarcia7e4.dam1.m03.uf2.recursivity

import java.util.*

fun fact(num: Int): Int{
    if(num == 0){
        return 1
    }
    return num * fact(num-1)
}
fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()
    println(fact(num))
}