package cat.itb.martigarcia7e4.dam.m03.uf1.iterative

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero: ")
    val num = scan.nextInt()
    var mult = 1

    for(x in 1..9){
        val res = mult * num
        println("$mult * $num = $res")
        mult += 1
    }
}