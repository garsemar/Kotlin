package cat.itb.martigarcia7e4.dam.m03.uf1.iterative

import java.util.*

class Player(var name:String, var score:Int)

fun main(){
    val scan = Scanner(System.`in`)
    println("Introdueix el nom i les puntiacions: ")

    var punts = 0
    var nom = ""
    var winner = Player(nom, punts)

    while(true){
        print("Introdueix un nom: ")
        nom = scan.next()
        if(nom == "END") break

        print("Introdueix els punts: ")
        punts = scan.nextInt()
        winner = Player(nom,punts)

        if(winner.score < punts){
            winner.score = punts
            winner.name = nom
        }
    }
    println("${winner.name}: ${winner.score}")
}
