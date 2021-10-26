package cat.itb.martigarcia7e4.dam.m03.uf1.seleccio.exam

import java.util.*

/*
    Trio: 3 cartes del mateix número
    Escala: 3 cartes amb números consecutius
    Parella: 2 cartes del mateix número
    Número alt: cap de les anteriors
 */

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix el numero de la primera carta: ")
    val card = scan.nextInt()
    print("Introdueix el numero de la segona carta: ")
    val card2 = scan.nextInt()
    print("Introdueix el numero de la tercera carta: ")
    val card3 = scan.nextInt()

    if(card == card2 && card == card3){
        println("Trio")
    }else if(card == card2){
        println("Parella")
    }else if(card == card3){
        println("Parella")
    }else if(card2 == card3){
        println("Parella")
    }else if(card2 in (card + 1) until card3){
        println("Escala")
    }else{
        println("Número alt")
    }
}