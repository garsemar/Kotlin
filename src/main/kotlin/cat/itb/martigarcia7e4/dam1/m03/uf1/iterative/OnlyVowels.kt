package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix el numero de lletres: ")
    val num = scan.nextInt()
    print("Introdueix les lletres: ")

    repeat(num){
        when(val text = scan.next().single()){
            'a', 'e', 'i', 'o', 'u' -> print("$text ")
        }
    }
}