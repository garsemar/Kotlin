package cat.itb.martigarcia7e4.dam.m03.uf1.seleccio.exam

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix la velocitat del coche: ")
    val vel = scan.nextInt()

    if(vel > 140){
        println("Multa greu")
    }else if(vel in 121..140){
        println("Multa lleu")
    }else{
        println("Correcte")
    }
}