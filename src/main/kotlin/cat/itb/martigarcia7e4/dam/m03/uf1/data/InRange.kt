package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var num1 = scan.nextInt()
    var num2 = scan.nextInt()
    var num3 = scan.nextInt()
    var num4 = scan.nextInt()
    var num5 = scan.nextInt()

    if(num5 in num1..num2 && num5 in num3..num4){
        println("True")
    }else{
        println("False")
    }
}