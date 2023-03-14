package cat.itb.martigarcia7e4.dam2.m09.uf2

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val lists = mutableListOf<List<Int>>()
    val time = measureTimeMillis {
        val item = async { fila1() }
        val item2 = async { fila1() }
        val item3 = async { fila1() }

        lists.add(item.await())
        lists.add(item2.await())
        lists.add(item3.await())
    }
    println(lists)
    println("$time ms")
}
fun fila1(): List<Int>{
    val list = mutableListOf<Int>()
    for(i in 1..1000){
        list.add(i)
    }
    return list
}