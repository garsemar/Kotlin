package cat.itb.martigarcia7e4.dam2.m06.uf1.xml

import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.entrenaments.Entrenament
import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.entrenaments.Entrenaments
import kotlinx.serialization.decodeFromString
import nl.adaptivity.xmlutil.serialization.XML
import java.util.Scanner
import kotlin.io.path.*

fun main() {
    val scan = Scanner(System.`in`)
    val xml = Path("./src/main/kotlin/cat/itb/martigarcia7e4/dam2/m06/uf1/resources/entrenaments.xml")
//    System::class.java.getResource("/entrenament.xml")

    val entrenaments = Entrenaments(mutableListOf(Entrenament(scan.next(), scan.nextInt())))
    val enEntre = mutableListOf<Entrenaments>()
    if (xml.exists() && xml.readText().isNotEmpty()) {
        enEntre.add(XML.decodeFromString(xml.readText()))
        for (i in enEntre.indices){
            for (j in enEntre[i].entrenament.indices){
                entrenaments.entrenament.add(enEntre[i].entrenament[j])
            }
        }
    }

    xml.writeText(XML.encodeToString(entrenaments))

    println("Duracio total: ${entrenaments.entrenament.sumOf { it.duration }}")
    println("Total per sport: ${totalPerSport(entrenaments)}")
}

fun totalPerSport(entrenaments: Entrenaments): List<Pair<String, Int>> {
    return entrenaments.entrenament.groupBy { it.name }.map {
            it -> it.key to it.value.sumOf { it.duration }
    }
}