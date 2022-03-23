package cat.itb.martigarcia7e4.dam.m03.uf3.fileInputOutput

import java.nio.file.Path
import java.util.*
import kotlin.io.path.Path
import kotlin.io.path.writeText

fun main() {
    val scan = Scanner(System.`in`)
    val path: Path = Path("secret.txt")
    val secretKey = scan.next()

    path.writeText(secretKey)
    println("guardat")
}