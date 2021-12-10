package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val list = mutableListOf(
        "Magalí", "Magdalena", "Magí", "Màlika", "Manel", "Manela", "Mar", "Marc", "Margalida", "Marçal", "Marcel", "Maria", "Maricel", "Marina", "Marta", "Martí", "Martina", "Mausi", "Mei-Xiu", "Miquel", "Ming", "Mohamed"
    )
    while(true){
        val num = scan.nextInt()
        if(num == -1)break
        list.removeAt(num)
    }
    print(list)
}