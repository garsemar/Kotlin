package cat.itb.martigarcia7e4.dam.m03.uf3.exercices

import java.nio.file.Path
import java.util.*
import kotlin.io.path.*

fun main() {
    val scan = Scanner(System.`in`)
    val path : Path = Path.of(scan.next())
    val files : List<Path> = path.listDirectoryEntries()
    val onlyFiles : List<Path> = path.listDirectoryEntries("*.")
    
}