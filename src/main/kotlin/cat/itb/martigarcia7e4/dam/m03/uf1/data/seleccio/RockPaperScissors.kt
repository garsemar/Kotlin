package cat.itb.martigarcia7e4.dam.m03.uf1.data.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Selecciona que vols jugar(1 piedra, 2 papel, 3 tijera): ")
    val player1 = scan.nextInt()
    print("Selecciona que vols jugar(1 piedra, 2 papel, 3 tijera): ")
    val player2 = scan.nextInt()

    //1 piedra, 2 papel, 3 tijera
    if(player1 == player2) {
        println("Tie")
    }else if(player1 == 1 && player2 == 2){
        println("Guanya el segon")
    }else if(player1 == 1 && player2 == 3){
        println("Guanya el primer")
    }else if(player1 == 2 && player2 == 1){
        println("Guanya el primer")
    }else if(player1 == 2 && player2 == 3){
        println("Guanya el segon")
    }else if(player1 == 3 && player2 == 1){
        println("Guanya el segon")
    }else if(player1 == 3 && player2 == 2){
        println("Guanya el primer")
    }else{
        println("Incorrecto")
    }
}