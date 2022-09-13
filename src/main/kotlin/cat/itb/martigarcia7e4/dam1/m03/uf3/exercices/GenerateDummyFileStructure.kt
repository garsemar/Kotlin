package cat.itb.martigarcia7e4.dam1.m03.uf3.exercices

import java.nio.file.Path
import java.util.*
import kotlin.io.path.*

fun main() {
    val scan = Scanner(System.`in`)
    var path: Path
    val homePath : String = System.getProperty("user.home")

    for(i in 101..100000) {
        path = Path("$homePath/$i")
        path.createDirectory()
    }
}