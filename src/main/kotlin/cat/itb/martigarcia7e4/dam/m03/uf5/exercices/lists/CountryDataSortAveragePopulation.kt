package cat.itb.martigarcia7e4.dam.m03.uf5.exercices.lists

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    val countryList = ArrayList<Country>()
    repeat(scan.nextInt()) {
        countryList.add(Country(scan.next(), scan.next(), scan.nextInt(), scan.nextInt()))
    }

    countryList.filter { it.superficie < 1200000 }
    val filterCountry = countryList.map { it.densitat*it.superficie }

    println(filterCountry.average().toInt())
}