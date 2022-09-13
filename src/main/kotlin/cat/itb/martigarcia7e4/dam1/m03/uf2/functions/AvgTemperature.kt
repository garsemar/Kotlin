package cat.itb.martigarcia7e4.dam1.m03.uf2.functions

import java.util.*

data class AvgTemperature(val list: List<Int>){
    fun avg(): Double {
        var sum = 0.0
        for(i in list.indices){
            sum += list[i]
        }
        sum /= list.size
        return sum
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    val avgT = AvgTemperature(readIntList(scan))
    println("Ha fet ${avgT.avg()} graus de mitjana")
}