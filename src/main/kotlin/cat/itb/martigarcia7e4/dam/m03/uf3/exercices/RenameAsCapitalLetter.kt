package cat.itb.martigarcia7e4.dam.m03.uf3.exercices

import java.io.File
import java.nio.file.Path
import java.util.*
import kotlin.io.path.*

fun main() {
    val scan = Scanner(System.`in`)
    val path : Path = Path.of(scan.next())
    val files : List<Path> = path.listDirectoryEntries()
    var filer: File
    println(files)
    for(i in files.indices){
        filer = files[i].toFile()
    }
}