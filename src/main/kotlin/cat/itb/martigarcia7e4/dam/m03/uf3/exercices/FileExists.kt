package cat.itb.martigarcia7e4.dam.m03.uf3.exercices

import java.nio.file.*
import java.util.*
import kotlin.io.path.*

fun main() {
    val scan = Scanner(System.`in`)

    val path : Path = Path.of(scan.next())

    if(path.exists()){
        println(true)
    }else{
        println(false)
    }
}