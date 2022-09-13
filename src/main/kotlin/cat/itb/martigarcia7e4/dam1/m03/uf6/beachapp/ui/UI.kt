package cat.itb.martigarcia7e4.dam1.m03.uf6.beachapp.ui

import cat.itb.martigarcia7e4.dam1.m03.uf6.beachapp.model.BeachApp
import java.util.Scanner

class UI(val scan: Scanner) {
    private val beachApp = BeachApp(scan)
    fun menu(){
        while(true){
            println("Vols (1) afegir, (2) modificar qualitat, (3) llistar, (4) resum? (0) sortir")
            when(scan.nextInt()){
                1 -> addBeach()
                2 -> modifyQuality()
                3 -> listBeaches()
                4 -> resum()
                0 -> return
                else -> println("Opció incorrecta")
            }
        }
    }
    private fun addBeach() {
        println("Afegir platges")
        println("ID Nom Ciutat Qualitat")
        beachApp.addBeach(scan.nextInt(), scan.next(), scan.next(), scan.nextFloat())
        println("Afegida amb exit")
    }
    private fun modifyQuality() {
        println("Modificar qualitat")
        println("ID NovaQualitat")
        beachApp.modifyQuality(scan.nextInt(), scan.nextFloat())
        println("Modificada amb exit")
    }
    private fun listBeaches() {
        println("Llistat de platges")
        beachApp.listBeaches().forEach { println(it) }
    }
    private fun resum() {
        println("Resum")
        val beachMap = beachApp.resum()
        var i = 0
        for(value in beachMap){
            println("$i. ${value.key} (${value.value})")
            i += 1
        }
    }
}