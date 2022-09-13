package cat.itb.martigarcia7e4.dam1.m03.uf2.recursivity

import java.util.*

fun power(num: Int, num2: Int): Int{
    if(num2 == 0){
        return 1
    }
    return num * power(num, num2-1)
}

fun main() {
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()
    val num2 = scan.nextInt()

    println(power(num, num2))
}