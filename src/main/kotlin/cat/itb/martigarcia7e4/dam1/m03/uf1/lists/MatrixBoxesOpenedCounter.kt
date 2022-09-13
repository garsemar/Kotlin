package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val matrix = List(4) {
        MutableList(4){0}
    }
    while(true){
        val num = scan.nextInt()
        if(num == -1)break
        val num2 = scan.nextInt()
        if(num2 == -1)break
        matrix[num][num2] += 1
    }
    print(matrix)
}