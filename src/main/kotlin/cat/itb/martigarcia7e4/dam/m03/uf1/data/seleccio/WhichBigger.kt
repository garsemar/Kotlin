package cat.itb.martigarcia7e4.dam.m03.uf1.data.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()

    if(num1 > num2){
        println(num1)
    }else{
        println(num2)
    }
}