package cat.itb.martigarcia7e4.dam.m03.uf1.seleccio.exam

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un dia: ")
    val dia = scan.nextLine()

    when(dia){
        "dilluns" -> println("Compra llums")
        "dimarts" -> println("Compra naps")
        "dimecres" -> println("Compra nespres")
        "dijous" -> println("Compra nous")
        "divendres" -> println("Faves tendres")
        "dissabte" -> println("Tot s'ho gasta")
        "diumenge" -> println("Tot s'ho menja")
    }
}