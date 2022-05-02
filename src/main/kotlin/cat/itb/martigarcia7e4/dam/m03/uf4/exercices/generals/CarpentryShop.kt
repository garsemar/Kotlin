package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.generals

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
    val price = sumPrices(products)
    println("El preu total és: $price€")
}

fun sumPrices(products: List<CarpentryShop>): Int {
    var sum = 0
    for(product in products){
        sum += product.totalPrice
    }
    return sum
}

fun readProduct(scanner: Scanner) : CarpentryShop{
    val type = scanner.next()
    when(type){
        "Taulell" -> return readTaulell(scanner)
        else -> return readLlisto(scanner)
    }
}

fun readLlisto(scanner: Scanner) =
    Llisto(scanner.nextInt(), scanner.nextInt())

fun readTaulell(scanner: Scanner) =
    Taulell(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
