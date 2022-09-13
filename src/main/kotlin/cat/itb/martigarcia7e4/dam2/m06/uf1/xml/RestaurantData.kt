package cat.itb.martigarcia7e4.dam2.m06.uf1.xml

import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XML
import nl.adaptivity.xmlutil.serialization.XmlElement
import kotlin.io.path.Path
import kotlin.io.path.listDirectoryEntries
import kotlin.io.path.readText

@Serializable
data class Restaurant(
    @XmlElement(true) val name: String,
    @XmlElement(true) val address: String,
    @XmlElement(true) val owner: String,
    val type: String
)

fun main() {
    val xml = Path("./").listDirectoryEntries()
    // val person : Restaurant = XML.decodeFromString(xml)
    // println(person)
    println(xml)
}