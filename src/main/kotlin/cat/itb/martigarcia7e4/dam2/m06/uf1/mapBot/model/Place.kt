package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model

import cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.regex.esPalindrom
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Place.Companion.places
import kotlinx.coroutines.Deferred
import java.util.Locale

data class Place(
    val name: String,
    val cords: String
){
    companion object{
        const val id: Long = 1631082699
        val places = mutableMapOf<Long, MutableList<Place>>((id to mutableListOf(Place("casa", "41.4104983,2.1875349"), Place("casa2", "41.4156156,2.1469278"))))
    }
}