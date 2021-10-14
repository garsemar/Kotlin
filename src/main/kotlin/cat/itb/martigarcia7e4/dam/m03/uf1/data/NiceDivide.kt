package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()

    val res = num1/num2
    val por = num1%num2

    println("$num1 dividit entre $num2 es $res mòdul $por")
}