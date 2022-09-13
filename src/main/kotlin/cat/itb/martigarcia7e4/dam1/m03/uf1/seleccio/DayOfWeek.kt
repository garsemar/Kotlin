package cat.itb.martigarcia7e4.dam1.m03.uf1.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un dia: ")
    val dia = scan.nextInt()
    val dias = mapOf(
        1 to "Lunes",
        2 to "Martes",
        3 to "Mircoles",
        4 to "Jueves",
        5 to "Viernes",
        6 to "Sabado",
        7 to "Domingo"
    )
    print(dias[dia])
}