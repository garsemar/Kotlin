package cat.itb.martigarcia7e4.dam2.m06.uf1.xml

import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.entrenaments.Entrenament
import kotlinx.serialization.decodeFromString
import nl.adaptivity.xmlutil.serialization.XML
import java.util.Scanner
import kotlin.io.path.*

fun main() {
    val scan = Scanner(System.`in`)
    val xml = Path("./src/main/kotlin/cat/itb/martigarcia7e4/dam2/m06/uf1/resources/entrenaments.xml")
//    System::class.java.getResource("/entrenament.xml")

    val entrenament = mutableListOf(Entrenament(scan.next(), scan.nextInt()))

    if (xml.exists() && xml.readText().isNotEmpty()) {
        entrenament.add(XML.decodeFromString(xml.readText()))
    }

    xml.writeText(XML.encodeToString(entrenament))
}