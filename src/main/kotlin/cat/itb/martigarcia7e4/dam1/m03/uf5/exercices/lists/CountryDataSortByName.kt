package cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.lists

import java.util.*

data class Country(var nom: String, var capital: String, val superficie: Int, val densitat: Int){

}

fun main() {
    val scan = Scanner(System.`in`)

    val countryList = ArrayList<Country>()
    repeat(scan.nextInt()) {
        countryList.add(Country(scan.next(), scan.next(), scan.nextInt(), scan.nextInt()))
    }

    countryList.sortBy { it.nom }
    countryList.forEach { if(it.densitat > 5 && it.superficie > 1000) println(it.nom) }
}