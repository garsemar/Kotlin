package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix l'ultim numero: ")
    val numFi = scan.nextInt()
    print("Introdueix numero de salt: ")
    val numSalt = scan.nextInt()
    var numF = 1

//    while(numF < numFi){
//        println(numF)
//        numF += numSalt
//    }
    for(x in 1..numFi step numSalt){
        println(x)
    }
}