package cat.itb.martigarcia7e4.dam1.m03.uf2.functions

import java.util.*

data class StudentStats(val list: List<Int>){
    fun notaMi(): Int? {
        return this.list.minOrNull()
    }
    fun notaMa(): Int?{
        return this.list.maxOrNull()
    }
    fun notaMit(): Double{
        return this.list.average()
    }
}

fun main(){
    val scan = Scanner(System.`in`)
    val stundent = StudentStats(readIntList(scan))
    println("Nota mínima: ${stundent.notaMi()}")
    println("Nota màxima: ${stundent.notaMa()}")
    println("Nota mitjana: ${stundent.notaMit()}")
}