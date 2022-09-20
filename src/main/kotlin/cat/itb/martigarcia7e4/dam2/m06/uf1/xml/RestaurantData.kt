package cat.itb.martigarcia7e4.dam2.m06.uf1.xml

import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.restaurant.Restaurant
import nl.adaptivity.xmlutil.serialization.XML
import kotlin.io.path.Path
import kotlin.io.path.readText

fun main() {
    val xml = Path("./src/main/kotlin/cat/itb/martigarcia7e4/dam2/m06/uf1/resources/restaurant.xml").readText()
    val person: Restaurant = XML.decodeFromString(xml)
    println(person)
}