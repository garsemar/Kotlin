package cat.itb.martigarcia7e4.dam.m03.uf3.exercices

import kotlin.io.path.*
import java.nio.file.*
import java.io.File
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var patata = scan.next()
    if(patata.last() != '/'){
        patata += '/'
    }
    val path: Path = Paths.get(patata)
    val files : List<Path> = path.listDirectoryEntries("*.*")
    val filesList = mutableListOf<File>()
    val upperList = mutableListOf<File>()
    var char: String
    var name: File

    for(i in files.indices){
        name = files[i].toFile()

        char = name.toString().split("/").last()

        if(char[0] != '.'){
            upperList.add(File(char.uppercase()))
            filesList.add(name)
        }
    }

    for(i in filesList.indices){
        filesList[i].renameTo(File("$patata${upperList[i]}"))
    }
}