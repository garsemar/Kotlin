package cat.itb.martigarcia7e4.dam2.m06.uf1.repas

import java.nio.file.Path
import kotlin.io.path.*

fun main() {
    val homePath = Path(System.getProperty("user.home"))
    writeText(homePath.resolve("desktopContents.txt"), homePath.resolve("Escriptori"))
}

fun writeText(path: Path, lsPath: Path){
    val files : List<Path> = lsPath.listDirectoryEntries()
    path.writeText(files.size.toString())

    println(files)
}