package cat.itb.martigarcia7e4.dam.m03.uf3.generalexam

import java.io.File
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    /**
     * Variable declaration
     */
    val source = File(scan.next())
    val target = File(scan.next())
    val nom = scan.next()
    val cognom = scan.next()
    val fullTarget = File("${target}/$cognom/$nom")
    /**
     * Check if it is a directory
     */
    if(source.isDirectory) {
        println("No es pot copiar una carpeta")
        return
    }
    /**
     * Check if the source exists
     */
    else if(!source.exists()){
        println("Fitxer no existeix")
        return
    }
    /**
     * Check if in the target folder there is a file with the same name as the source file
     */
    else if(File("$fullTarget/${source.name}").exists()){
        File("$fullTarget/${source.name}").delete()
    }
    /**
     * Copy the source file to the target folder
     */
    source.copyTo(File("$fullTarget/${source.name}"))
    println("Fitxer copiat a la carpeta $fullTarget")
}