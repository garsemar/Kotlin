package cat.itb.martigarcia7e4.dam.m03.uf2.functions

import java.util.*

data class teams(val nomEquip: String, val punts: MutableList<Int>)

data class MatchAnalizer(var puntsA: Int, var puntsB: Int){
    fun comprovar(listaA: List<Int>, listaB: List<Int>){
        for(i in listaA.indices){
            when (listaA[i]){
                puntsA+1 -> tirL(listaA[i], nomEquipA, 0)
                puntsA+2 -> cis(listaA[i], nomEquipA, 0)
                puntsA+3 -> triple(listaA[i], nomEquipA, 0)
            }
        }
        for(j in listaB.indices) {
            when (listaB[j]) {
                puntsB + 1 -> tirL(listaB[j], equipB, 1)
                puntsB + 2 -> cis(listaB[j], equipB, 1)
                puntsB + 3 -> triple(listaB[j], equipB, 1)
            }
        }
    }

    fun tirL(punts: Int, equip: String, ns: Int){
        println("Tir lliure de $equip")
        if(ns == 0) puntsA = punts
        else puntsB = punts
    }
    fun cis(punts: Int, equip: String, ns: Int){
        println("Cistella de $equip")
        if(ns == 0) puntsA = punts
        else puntsB = punts
    }
    fun triple(punts: Int, equip: String, ns: Int){
        println("Triple de $equip")
        if(ns == 0) puntsA = punts
        else puntsB = punts
    }
}

fun main(){
    val scan = Scanner(System.`in`)
    val matchAnalizer = MatchAnalizer(0, 0)
    val nomEquipA = scan.next()
    val nomEquipB = scan.next()
    val teamA = teams(nomEquipA, mutableListOf())
    val teamB = teams(nomEquipB, mutableListOf())
    var num: Int
    while (true){
        num = scan.nextInt()
        if (num != -1){
            teamA.punts.add(num)
        } else break
        num = scan.nextInt()
        if (num != -1){
            teamB.punts.add(num)
        } else break
    }
    matchAnalizer.comprovar(teamA.punts, teamB.punts)
}
