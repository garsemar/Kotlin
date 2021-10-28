package cat.itb.martigarcia7e4.dam.m03.uf1.iterative
import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero: ")
    val num = scan.nextInt()
    var num1 = 1

    repeat(num){
        println(num1)
        num1 += 1
    }
}