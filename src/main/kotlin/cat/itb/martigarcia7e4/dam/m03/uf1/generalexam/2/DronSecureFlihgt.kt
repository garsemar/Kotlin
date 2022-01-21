package cat.itb.naimgomez7e5.dam.m03.uf1.generalexam

import java.util.*

// Por alguna razón no admite los caracteres especiales de la práctica
// He utilizado la siguiente matrix que es esencialmente lo mismo.
// 0010100011
// 0101000110
// 0000101000
// 1111100011
// 0010111111
// 0010100011
// 1001000110
// 0111000100
// 0101000110
// 0010100011
// 0110010100

fun main() {
    val scan = Scanner(System.`in`);

    val matrix = mutableListOf<String>()
    repeat(10)
    {
        matrix.add(scan.next())
    }


    val free = '0'
    for(i in 1 until 9){
        for(j in 1 until 9){

            if(
                matrix[i-1][j-1] == free &&
                matrix[i-1][j]  == free &&
                matrix[i-1][j+1]  == free &&

                matrix[i][j-1] == free &&
                matrix[i][j]  == free &&
                matrix[i][j+1]  == free &&

                matrix[i+1][j-1] == free &&
                matrix[i+1][j]  == free &&
                matrix[i+1][j+1]  == free
            )
            {
                println("$j $i")
                return;
            }

        }
    }
}