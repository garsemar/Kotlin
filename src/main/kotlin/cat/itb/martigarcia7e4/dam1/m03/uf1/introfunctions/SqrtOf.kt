package cat.itb.martigarcia7e4.dam1.m03.uf1.introfunctions

import java.util.*
import kotlin.math.sqrt

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero: ")
    var num = scan.nextInt()

    num = sqrt(num.toDouble()).toInt()
    println(num)
}