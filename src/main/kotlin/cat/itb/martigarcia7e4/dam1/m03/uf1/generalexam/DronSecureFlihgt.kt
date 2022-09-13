package cat.itb.martigarcia7e4.dam1.m03.uf1.generalexam

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var secure = 0
    val matrix = List(11){
        List(10){
            scan.next()
        }
    }
    for(i in 0..matrix.lastIndex){
        for(j in 0..matrix[i].lastIndex){
            if(matrix[i][j] == "🟩"){
                secure++
            }
        }
    }
    print(secure)
}