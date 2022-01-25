package cat.itb.martigarcia7e4.dam.m03.uf2.classfun

import java.util.*
import kotlin.math.sqrt

data class RightTriangleSize(var base: MutableList<Double>, var altura: MutableList<Double>){
    private fun superficie(): MutableList<Double> {
        val resu = mutableListOf<Double>()
        for(i in 0..base.lastIndex){
            resu.add((base[i]*altura[i])/2)
        }
        return resu
    }
    private fun perimetre(): MutableList<Double> {
        val resu = mutableListOf<Double>()
        for(i in 0..base.lastIndex){
            resu.add(sqrt((altura[i]*2)+(base[i]*2)))
        }
        return resu
    }
    fun toOutput(){
        for(i in 0..base.lastIndex) {
            println("Un triangle de ${base[i]} x ${altura[i]} té ${"%.2f".format(superficie()[i])} d'àrea i ${"%.2f".format(perimetre()[i])} de perímetre.")
        }
    }
}

fun main(){
    val scan = Scanner(System.`in`)
    val triangleSize = RightTriangleSize(mutableListOf(), mutableListOf())
    val num = scan.nextInt()
    repeat(num){
        triangleSize.base.add(scan.nextDouble())
        triangleSize.altura.add(scan.nextDouble())
    }
    triangleSize.toOutput()
}