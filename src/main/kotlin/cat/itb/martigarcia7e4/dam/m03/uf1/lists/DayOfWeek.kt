package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un dia: ")
    val dia = scan.nextInt()

    val dias = listOf(
        "Lunes",
        "Martes",
        "Mircoles",
        "Jueves",
        "Viernes",
        "Sabado",
        "Domingo"
    )
    print(dias[dia])
}