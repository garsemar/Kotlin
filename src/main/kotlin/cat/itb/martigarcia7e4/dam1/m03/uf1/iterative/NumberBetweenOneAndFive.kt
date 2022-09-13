package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero entre el 1 i el 5: ")
    var num = scan.nextInt()

    while(num !in 1..5){
        print("Introdueix un numero entre el 1 i el 5: ")
        num = scan.nextInt()
    }
    println("El número introduït: $num")
}