package cat.itb.martigarcia7e4.dam.m03.uf3.fileInputOutput

import org.w3c.dom.Text
import java.nio.file.Path
import kotlin.io.path.Path
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.reader

fun main() {
    val path = Path("/home/sjo/radar.txt")

    val text: String = path.readText()
    val textList: List<String> = text.split(" ")
    val result = textList.map { it.replace("\n", "").toInt() }

    println("Velocitat màxima: ${result.maxOrNull()}km/h")
    println("Velocitat mínima: ${result.minOrNull()}km/h")
    println("Velocitat mitjana: ${result.average()}km/h")
}