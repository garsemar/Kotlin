package cat.itb.martigarcia7e4.dam.m03.uf2.functions

import java.util.*


data class Equip(var nom: String, var puntuacio: Int = 0) {


    fun actualitzarPuntuacio(novaPuntuacio: Int): Int {
        val punts = novaPuntuacio - this.puntuacio
        puntuacio = novaPuntuacio
        return punts
    }
}
data class Marcador(var value1: Int, var value2: Int) {
    var exit = false
}
fun llegirMarcador(scanner: Scanner): Marcador {
    var marcador:Marcador
    var value1 = scanner.nextInt()
    if (value1 == -1){
        marcador = Marcador(0,0)
        marcador.exit = true
    } else {
        var value2 = scanner.nextInt()
        marcador = Marcador(value1,value2)
    }
    return marcador
}

fun llegirEquip(scanner: Scanner): Equip {
    var name = scanner.nextLine()
    return Equip(name)
}


fun imprimirValors(equip: Equip, tipuCistellaManresa: Int) {
    var comentari = when (tipuCistellaManresa) {
        1 -> "Tir lliure"
        2 -> "Cistella"
        else -> "Triple"

    }
    comentari = comentari+" de"+equip.nom
    println(comentari)
}

fun main() {
    val scanner = Scanner(System.`in`)

    val equip1 = llegirEquip(scanner)
    var equip2 = llegirEquip(scanner)
    var marcador = Marcador(0, 0)
    while (marcador.exit != false) {

        var tipuCistellaManresa = equip1.actualitzarPuntuacio(marcador.value1)
        var tipuCistellaJoventut = equip2.actualitzarPuntuacio(marcador.value2)
        if (tipuCistellaJoventut > tipuCistellaManresa) imprimirValors(equip2, tipuCistellaJoventut)
        else imprimirValors(equip2, tipuCistellaJoventut)
        var marcador = llegirMarcador(scanner)
    }
    var guanyador=calcularGuanyador(equip1,equip2)
    println ("Guanya $guanyador")
}

fun calcularGuanyador(equip1: Equip, equip2: Equip): String {
    return  if (equip1.puntuacio > equip2.puntuacio) equip1.nom else equip2.nom
}

