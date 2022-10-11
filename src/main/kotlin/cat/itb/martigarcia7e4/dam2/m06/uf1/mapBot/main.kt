package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot

import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.repositories.Api

suspend fun main() {
    val api = Api()

    println(api.googleGeo("C/ter 33 barcelona"))
    //GlobalScope
    println(api.tmbRoute("41.4104983,2.1875349", "41.4229753,2.1871792"))
}