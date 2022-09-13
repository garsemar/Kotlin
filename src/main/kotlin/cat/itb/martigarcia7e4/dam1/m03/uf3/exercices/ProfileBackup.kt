package cat.itb.martigarcia7e4.dam1.m03.uf3.exercices

import java.io.File
import java.time.*

fun main() {
    val homePath : String = System.getProperty("user.home")
    val source = File("$homePath/.profile")
    val target = File("$homePath/backup/${LocalDateTime.now()}/.profile")
    source.copyTo(target)
}