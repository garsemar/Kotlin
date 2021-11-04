package cat.itb.martigarcia7e4.dam.m03.uf1.iterative

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix la base: ")
    val base = scan.nextInt()
    print("Introdueix l'exponent: ")
    val exp = scan.nextInt()
    var res = 1
    repeat(exp){
        res *= base
    }
    println(res)
}