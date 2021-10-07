package cat.itb.martigarcia7e4.dam.m03.uf1.data
import java.util.*

class Empleada(val name: String, val lastname: String, val desp: Int) {
    fun imprimirNom(){
        println("Empleada: $name $lastname - Despatx: $desp")
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    //BusinessCardPrinter
    val userInout8 = scan.nextLine()
    val userInout9 = scan.nextLine()
    val userInout10 = scan.nextInt()
    val object1 = Empleada(userInout8, userInout9, userInout10)
    object1.imprimirNom()
}