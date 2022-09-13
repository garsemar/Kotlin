package cat.itb.martigarcia7e4.dam1.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var diaAniversari = scan.nextInt()
    var mesAniversari = scan.nextInt()
    var diaActual = scan.nextInt()
    var mesActual = scan.nextInt()

    if(mesAniversari > mesActual){
        println("No")
    }else if(mesAniversari < mesActual){
        println("Si")
    }else if(mesAniversari == mesActual){
        if(diaAniversari <= diaActual){
            println("Si")
        }else{
            println("No")
        }
    }
}