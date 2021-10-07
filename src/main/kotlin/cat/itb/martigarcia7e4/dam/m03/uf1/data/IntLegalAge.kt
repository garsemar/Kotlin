package cat.itb.martigarcia7e4.dam.m03.uf1.data
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    //IsLegalAge
    println("IsLegalAge")
    val userInout5 = scan.nextInt()
    if (userInout5 >+ 18) {
        println("True")
    }else {
        println("False")
    }
}