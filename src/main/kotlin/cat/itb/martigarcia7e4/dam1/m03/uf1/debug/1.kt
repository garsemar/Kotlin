package cat.itb.martigarcia7e4.dam1.m03.uf1.debug

import kotlin.math.sqrt

fun main() {
    val start = 7
    val end = 1252
    var tempValue1 = 1548
    var tempValue2 = -457
    var tempValue3 = 254
    for (i in start..end) {
        tempValue1 -= tempValue2
        tempValue2 += sqrt(tempValue1.toDouble()).toInt()
        tempValue3 -= i
    }
    println("tempValue1 = $tempValue1")
    println((Math.log(tempValue2*1.0)*5424).toInt())
    println("tempValue2 = $tempValue2")
    println("tempValue3 = $tempValue3")
}