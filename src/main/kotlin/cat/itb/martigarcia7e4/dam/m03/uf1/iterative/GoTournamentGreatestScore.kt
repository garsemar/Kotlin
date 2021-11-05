package cat.itb.martigarcia7e4.dam.m03.uf1.iterative

import java.util.*

class Player(var name:String, var score:Int)

fun main(){
    val scan = Scanner(System.`in`)
    println("Introdueix el nom i les puntiacions: ")

    var punts = 0
    var nom = ""
    val winner = Player(nom, punts)

    while(true){
        print("Introdueix un nom: ")
        nom = scan.next()
        nom += scan.nextLine()
        if(nom == "END") break

        print("Introdueix els punts: ")
        punts = scan.nextInt()
        if(punts > winner.score){
            winner.score = punts
            winner.name = nom
        }
    }
    println("${winner.name}: ${winner.score}")
}
