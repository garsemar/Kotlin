package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

data class PriceList(val name:String, val price:String)

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix el numero de productes: ")
    var num = scan.nextInt()
    val list = mutableListOf<PriceList>()
    println("Introdueix el nom i preu del producte:")
    while(num != 0){
        val name = scan.next()
        val price = scan.next()
        list.add(PriceList(name, price))
        num--
    }
    for(i in 1..list.size){
        println("El producte ${list[i-1].name} val ${list[i-1].price}€")
    }
}