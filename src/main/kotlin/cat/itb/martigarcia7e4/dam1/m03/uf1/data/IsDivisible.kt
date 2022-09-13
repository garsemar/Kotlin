package cat.itb.martigarcia7e4.dam1.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()

    if(num1 % num2 == 0){
        println("True")
    }else{
        println("False")
    }
}