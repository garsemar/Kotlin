package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative
import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    var counter = 0
    var text = ""
    println("Introdueix un text: ")

    while(text != ("END")){
        text = scan.nextLine()
        counter += 1
    }
    println(counter-1)
}