package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un mes: ")
    val mes = scan.nextInt()

    if(mes == 2){
        println("28 dias")
    }else if(mes % 2 != 0 && mes < 8 || mes % 2 == 0 && mes > 7) {
        println("31 dias")
    }else if(mes % 2 == 0 && mes < 8 || mes % 2 != 0 && mes > 7){
        println("30 dias")
    }
}