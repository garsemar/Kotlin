package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val edad = scan.nextInt()

    if(edad in 11..19){
        println("True")
    }else{
        println("False")
    }
}