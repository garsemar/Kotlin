package cat.itb.martigarcia.dam.m03.uf1

import java.util.*
import javax.lang.model.element.Name

class Empleada(val name: String, val lastname: String, val desp: Int) {
    fun imprimirNom(){
        println("Empleada: $name $lastname - Despatx: $desp")
    }
}
class robot(val poss: Int, ) {

}
fun main(){
    val scan = Scanner(System.`in`)
    //IntDoubleMe
    /*
    println("IntDoubleMe")
    val userInout = scan.nextInt()
    println(userInout*2)

    //IntSum
    println("IntSum")
    val userInout1 = scan.nextInt()
    val userInout2 = scan.nextInt()
    println(userInout1+userInout2)

    //IntRectangleArea
    println("IntRectangleArea")
    println("Llargada")
    val userInout3 = scan.nextInt()
    println("Amplada")
    val userInout4 = scan.nextInt()
    println(userInout3*userInout4)

    //IsLegalAge
    println("IsLegalAge")
    val userInout5 = scan.nextInt()
    if (userInout5 >+ 18) {
        println("True")
    }else {
        println("False")
    }

    //NextNumber
    val userInout6 = scan.nextInt()
    println("Despres ve el $userInout6")

    //PrintCurrentTemperature
    val userInout7 = scan.nextFloat()
    println("La temperatura actual és $userInout7 º")

    //BusinessCardPrinter
    val userInout8 = scan.nextLine()
    val userInout9 = scan.nextLine()
    val userInout10 = scan.nextInt()
    val object1 = Empleada(userInout8, userInout9, userInout10)
    object1.imprimirNom()
     */
    //GameCharacter


    //BiggerPizza
    var PI = 3.1415
    println("Diametre rodona")
    val rodo = scan.nextDouble()
    println("Diametre rectangle")
    val rect = scan.nextDouble()
    val rect2 = scan.nextDouble()

    var circulo = rodo / 2
    circulo = (circulo*2)* PI
    var rectangulo = rect * rect2

    if (circulo > rectangulo) {
        println("True")
    }else{
        println("False")
    }

    //
}