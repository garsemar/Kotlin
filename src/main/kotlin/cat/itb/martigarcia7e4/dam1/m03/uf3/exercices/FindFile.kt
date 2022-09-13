package cat.itb.martigarcia7e4.dam1.m03.uf3.exercices

import java.io.File
import java.util.*
import kotlin.io.path.Path

fun main() {
    val scan = Scanner(System.`in`)
    val path = Path(scan.next())
    val fileSear = scan.next()

    val files : List<File> =  path.toFile().walk().toList()

    for(i in files.indices){
        if(files[i].isFile){
            if(files[i].name.toString() == fileSear){
                println(files[i])
            }
        }
    }
}