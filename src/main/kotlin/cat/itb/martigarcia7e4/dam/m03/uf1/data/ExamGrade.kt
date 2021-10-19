package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Escriu la teva nota: ")
    val num = scan.nextFloat()

    if(num in 0.0..5.0){
        println("Suspès")
    }else if(num in 5.0..6.0){
        println("Suficient")
    }else if(num in 6.0..7.0){
        println("Bé")
    }else if(num in 7.0..9.0){
        println("Notable")
    }else if(num in 9.0..10.0){
        println("Excelent")
    }else{
        println("Invalid")
    }
}