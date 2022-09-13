package cat.itb.martigarcia7e4.dam1.m03.uf1.seleccio.exam

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix l'edat de lanimal: ")
    val age = scan.nextInt()
    print("Introdueix el sexe de lanimal(1 = mascle, 2 = femella): ")
    val gender = scan.nextInt()
    print("Introdueix si l'animal esta capat(1 = no capat, 2 = capat): ")
    val capat = scan.nextInt()

    if(age < 2){
        println("vedell")
    }else if(gender == 2){
        println("vaca")
    }else if(capat == 1){
        println("toro")
    }else if(capat == 2){
        println("bou")
    }else{
        println("Error!")
    }
}