package cat.itb.martigarcia7e4.dam1.m03.uf1.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val edad = scan.nextInt()

    if(edad >= 18){
        println("ets major d'edat")
    }else{
        println("ets menor d'edat")
    }
}