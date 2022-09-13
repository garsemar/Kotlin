package cat.itb.martigarcia7e4.dam1.m03.uf1.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val persones = scan.nextInt()
    val galetes = scan.nextInt()

    if(galetes%persones == 0){
        println("Let's Eat!")
    }else{
        println("Let's Fight")
    }
}