package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val text = scan.next()

    if(text == text.reversed()){
        println("Es palindrom")
    }else{
        println("No es palindrom")
    }

}