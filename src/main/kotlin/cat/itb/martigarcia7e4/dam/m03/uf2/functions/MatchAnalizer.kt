package cat.itb.martigarcia7e4.dam.m03.uf2.functions

import java.util.*

data class Teams(val nomEquip: String, val punts: MutableList<Int>)

data class MatchAnalizer(var puntsA: Int, var puntsB: Int){
    fun comprovar(listaA: Teams, listaB: Teams){
        for(i in listaA.punts.indices){
            when (listaA.punts[i]){
                puntsA + 1 -> tirL(listaA.punts[i], listaA.nomEquip, 0)
                puntsA + 2 -> cis(listaA.punts[i], listaA.nomEquip, 0)
                puntsA + 3 -> triple(listaA.punts[i], listaA.nomEquip, 0)
            }
            when (listaB.punts[i]) {
                puntsB + 1 -> tirL(listaB.punts[i], listaB.nomEquip, 1)
                puntsB + 2 -> cis(listaB.punts[i], listaB.nomEquip, 1)
                puntsB + 3 -> triple(listaB.punts[i], listaB.nomEquip, 1)
            }
        }
    }
    private fun tirL(punts: Int, equip: String, ns: Int){
        println("Tir lliure de $equip")
        if(ns == 0) puntsA = punts
        else puntsB = punts
    }
    private fun cis(punts: Int, equip: String, ns: Int){
        println("Cistella de $equip")
        if(ns == 0) puntsA = punts
        else puntsB = punts
    }
    private fun triple(punts: Int, equip: String, ns: Int){
        println("Triple de $equip")
        if(ns == 0) puntsA = punts
        else puntsB = punts
    }
    fun guanyador(teamA: Teams, teamB: Teams){
        if(teamA.punts.last() > teamB.punts.last()){
            println("Guanyar ${teamA.nomEquip}")
        }else{
            println("Guanyar ${teamB.nomEquip}")
        }
    }
}

fun main(){
    val scan = Scanner(System.`in`)
    val matchAnalizer = MatchAnalizer(0, 0)
    val teamA = Teams(scan.next(), mutableListOf())
    val teamB = Teams(scan.next(), mutableListOf())
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
    matchAnalizer.comprovar(teamA, teamB)
    matchAnalizer.guanyador(teamA, teamB)
}