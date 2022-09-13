package cat.itb.martigarcia7e4.dam1.m03.uf3.fileInputOutput

import kotlin.io.path.Path
import kotlin.io.path.readText

fun main() {
    val path = Path("/home/sjo/radar.txt")

    val text: String = path.readText()
    val textList: List<String> = text.split(" ")
    val result = textList.map { it.replace("\n", "").toInt() }

    println("Velocitat màxima: ${result.maxOrNull()}km/h")
    println("Velocitat mínima: ${result.minOrNull()}km/h")
    println("Velocitat mitjana: ${result.average()}km/h")
}