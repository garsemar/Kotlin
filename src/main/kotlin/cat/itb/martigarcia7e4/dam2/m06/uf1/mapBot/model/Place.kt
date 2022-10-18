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
        val places = mutableMapOf<Long, MutableList<Place>>()
    }
}