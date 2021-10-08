package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var num = scan.nextInt()

    if(num == 5 || num == 10 || num == 20 || num == 50 || num == 100 || num == 500){
        println("True")
    }else{
        println("False")
    }
}