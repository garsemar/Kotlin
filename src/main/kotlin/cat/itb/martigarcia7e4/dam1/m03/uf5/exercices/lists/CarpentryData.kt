package cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.lists

import java.util.*

abstract class CarpentryShop(val preuUnitari: Int, val llargada: Int){
    abstract val size: Int
    val totalPrice get() = size * preuUnitari
}

class Taulell(preuUnitari: Int, llargada: Int, val amplada: Int): CarpentryShop(preuUnitari, llargada){
    override val size = llargada*amplada
}
class Llisto(preuUnitari: Int, llargada: Int): CarpentryShop(preuUnitari, llargada){
    override val size = llargada
}

fun main() {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    val products = List(count){
        readProduct(scanner)
    }

    var llistoTotal = 0
    var numCar = 0
    products.forEach { if(it is Llisto) llistoTotal += it.totalPrice }
    products.forEach { if(it.totalPrice > 100) numCar += 1 }

    println("Preu total llistons: $llistoTotal")
    println("Producte més car té una llargada de: ${products.sortedByDescending { it.totalPrice }[0].llargada}")
    println("Num productés de més de 100€: $numCar")
}

fun readProduct(scanner: Scanner) : CarpentryShop {
    return when (scanner.next()) {
        "Taulell" -> readTaulell(scanner)
        else -> readLlisto(scanner)
    }
}

fun readLlisto(scanner: Scanner) =
    Llisto(scanner.nextInt(), scanner.nextInt())

fun readTaulell(scanner: Scanner) =
    Taulell(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
