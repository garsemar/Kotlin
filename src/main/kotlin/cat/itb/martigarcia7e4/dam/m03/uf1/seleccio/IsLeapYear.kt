package cat.itb.martigarcia7e4.dam.m03.uf1.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un any: ")
    val year = scan.nextInt()

    if(year % 100 == 0 && year % 400 != 0){
        println("$year no és any de traspàs")
    }else if(year % 4 == 0 || year % 400 == 0){
        println("$year és any de traspàs")
    }else{
        println("$year no és any de traspàs")
    }
}
