package cat.itb.martigarcia7e4.dam.m03.uf5.exercices.lists

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val countryList = ArrayList<Country>()
    repeat(scan.nextInt()) {
        countryList.add(Country(scan.next(), scan.next(), scan.nextInt(), scan.nextInt()))
    }

    // put the names and capital of the countries in upper case
    countryList.forEach {
        it.nom = it.nom.uppercase(Locale.getDefault())
        it.capital = it.capital.uppercase(Locale.getDefault())
    }

    // print the list of countries
    countryList.forEach { println("${it.nom} ${it.capital} ${it.superficie} ${it.densitat}") }
}