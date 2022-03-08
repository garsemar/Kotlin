package cat.itb.martigarcia7e4.dam.m03.uf3.exercices

import java.io.File
import java.nio.file.Path
import java.util.*
import kotlin.io.path.listDirectoryEntries

fun main() {
    val scan = Scanner(System.`in`)
    val path: Path = Path.of(scan.next())
    val file: File = File(scan.next())

    val files: List<Path> = path.listDirectoryEntries()

    files
}