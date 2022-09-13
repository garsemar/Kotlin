package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.enums

import java.util.*

enum class Rainbow{
    ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
}

fun main() {
    val scan = Scanner(System.`in`)
    val input = scan.next()
    var a = false
    for(i in Rainbow.values()){
        if(input.equals(i.toString())){
            a = true
            break
        }
        else{
            a = false
        }
    }
    println(a)
}