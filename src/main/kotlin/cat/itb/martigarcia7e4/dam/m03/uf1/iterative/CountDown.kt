package cat.itb.martigarcia7e4.dam.m03.uf1.iterative
import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero: ")
    val num = scan.nextInt()
    var numP = num

    for(x in 1..num){
        println(numP)
        numP -= 1
    }
}