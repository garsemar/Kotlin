package cat.itb.martigarcia7e4.dam.m03.uf1.data.seleccio

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix la hora: ")
    var hour = scan.nextInt()
    print("Introdueix els minuts: ")
    var min = scan.nextInt()
    print("Introdueix els segons: ")
    var seg = scan.nextInt()
    var zero1 = ""
    var zero2 = ""
    var zero3 = ""

    seg += 1
    if(hour <= 9){
        zero3 = "0"
    }
    if(seg == 60){
        min += 1
        seg = 0
        zero1 = "0"
        if(min == 60){
            hour += 1
            zero2 = "0"
            min = 0
        }
    }
    if(seg <= 9){
        zero1 = "0"
    }
    println("$zero3$hour:$zero2$min:$zero1$seg")
}