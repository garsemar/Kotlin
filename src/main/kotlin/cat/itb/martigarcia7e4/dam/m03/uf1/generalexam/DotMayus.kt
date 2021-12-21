package cat.itb.martigarcia7e4.dam.m03.uf1.generalexam

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val hola = scan.nextInt()
    val list = mutableListOf<Int>()
    for(i in 1..hola+1) {
        val text = scan.nextLine()
        println(text)
        /*if (text[text.length] == '.') {
            println("a")
        }*/
    }
    println(list)
}