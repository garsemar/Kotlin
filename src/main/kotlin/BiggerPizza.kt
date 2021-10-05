package cat.itb.martigarcia.dam.m03.uf1
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    //BiggerPizza
    val PI = 3.1415
    println("Diametre rodona")
    val rodo = scan.nextDouble()
    println("Diametre rectangle")
    val rect = scan.nextDouble()
    val rect2 = scan.nextDouble()

    var circulo = rodo / 2
    circulo = (circulo*2)* PI
    val rectangulo = rect * rect2

    if (circulo > rectangulo) {
        println("True")
    }else{
        println("False")
    }
}