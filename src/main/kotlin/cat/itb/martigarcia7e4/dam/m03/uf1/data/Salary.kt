package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)

    var hores = scan.nextInt()
    var plus = hores - 40
    hores -= plus
    hores *= 40
    plus *= 60
    println(hores+plus)
}