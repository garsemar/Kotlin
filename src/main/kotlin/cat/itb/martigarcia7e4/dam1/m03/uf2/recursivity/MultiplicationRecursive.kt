package cat.itb.martigarcia7e4.dam1.m03.uf2.recursivity

import java.util.*

fun mult(num: Int, num2: Int): Int{
    if(num2 == 0){
        return 0
    }
    return num + mult(num, num2-1)
}

fun main(){
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()
    val num2 = scan.nextInt()

    println(mult(num, num2))
}