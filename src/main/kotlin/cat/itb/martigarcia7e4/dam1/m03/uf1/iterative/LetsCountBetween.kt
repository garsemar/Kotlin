package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative
import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero: ")
    var num = scan.nextInt()
    print("Introdueix un altre numero: ")
    val num2 = scan.nextInt()

    for(x in num until num2-1){
        num += 1
        println(num)
    }
}