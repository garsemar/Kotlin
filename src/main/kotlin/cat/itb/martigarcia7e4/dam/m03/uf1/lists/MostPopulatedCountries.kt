package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

data class Countries(var name:String, var pob:Int)

fun main(){
    val scan = Scanner(System.`in`)
    print("Quantes ciutats? ")
    val num = scan.nextInt()
    val list = mutableListOf<Countries>()

    repeat(num){
        print("Nom de la ciutat: ")
        val name = scan.next()
        print("Quanta poblacio: ")
        val pob = scan.nextInt()
        list.add(Countries(name, pob))
    }
    print("Minim de poblacio: ")
    val maxP = scan.nextInt()
    for(i in 1..list.size){
        if(list[i-1].pob > maxP){
            println(list[i-1].name)
        }
    }
}