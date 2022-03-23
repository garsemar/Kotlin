package cat.itb.martigarcia7e4.dam.m03.uf3.fileInputOutput

import java.time.LocalDateTime
import kotlin.io.path.Path
import kotlin.io.path.appendText

fun main() {
    val home = System.getProperty("user.home")
    val path = Path("$home/i_was_here.txt")

    val data = "I Was Here: ${LocalDateTime.now()}\n"

    path.appendText(data)
}