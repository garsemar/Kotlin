package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.logic

import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Location
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Place
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Place.Companion.places
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.repositories.Api
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class Logic {
    val api = Api()
    @OptIn(DelicateCoroutinesApi::class)
    fun addPlace(id: Long, input: List<String>){
        GlobalScope.async {
            val cords = api.googleGeo(input[2]).results[0].geometry.location
            if(places[id] == null){
                places[id] = mutableListOf(Place(input[1], "${cords.lat},${cords.lng}"))
            }
            else{
                places[id]?.add(Place(input[1], "${cords.lat},${cords.lng}"))
            }
        }
    }
    suspend fun xd(input: List<String>): Location {
        val jaj = GlobalScope.async {
            api.googleGeo(input[2]).results[0].geometry.location
        }
        return jaj.await()
    }
}