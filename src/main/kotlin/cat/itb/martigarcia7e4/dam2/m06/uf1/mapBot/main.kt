package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot

import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.logic.Logic
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.repositories.Api
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.ui.UI

fun main() {
    val api = Api()
    val ui = UI()

    //ui.runBot()
    Logic().addPlace(1, listOf("/set", "casa", "c/ter,33,barcelona"))

    /*println(api.googleGeo("C/ter 33 barcelona"))
    //GlobalScope
    println(api.tmbRoute("41.4104983,2.1875349", "41.4229753,2.1871792"))*/
}