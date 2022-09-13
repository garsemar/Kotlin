package cat.itb.martigarcia7e4.dam1.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val original = scan.nextInt()
    val actual = scan.nextInt()

    val res = (actual*100)/original
    println("$res%")
}