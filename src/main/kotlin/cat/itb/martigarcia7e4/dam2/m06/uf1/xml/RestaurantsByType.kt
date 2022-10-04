package cat.itb.martigarcia7e4.dam2.m06.uf1.xml

import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.restaurant.Restaurants
import nl.adaptivity.xmlutil.serialization.XML
import java.util.Scanner
import kotlin.io.path.Path
import kotlin.io.path.readText

fun main() {
    val scan = Scanner(System.`in`)
    val xml = Path("./src/main/resources/restaurants.xml").readText()
    val person: Restaurants = XML.decodeFromString(xml)
    println("Quin tipus de restaurant vols?")
    val type = scan.next()
    person.restaurant.forEach { if(it.type == type) println("${it.name} - ${it.address} - ${it.owner}") }
}