package cat.itb.martigarcia7e4.dam.m03.uf1.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val diamCir = scan.nextInt()
    val costat1 = scan.nextInt()
    val costat2 = scan.nextInt()

    val areaCir = diamCir*Math.PI
    val areaQua = costat1*costat2

    if(areaCir > areaQua){
        println("Compra la rodona")
    }else{
        println("Compra la rectangular")
    }
}