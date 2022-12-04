package cat.itb.martigarcia7e4.adventOfCode.year2022

import java.io.File

fun main() {
    val file = File("src/main/resources/adventOfCode/input4.txt").readLines().map { it.split(",") }

    overlapCalulator(file)
}

fun overlapCalulator(file: List<List<String>>){
    var overlaps = 0
    var overlaps2 = 0
    file.forEach {
        val mapped = it.map { it.split("-") }
        val ranges = Pair(mapped[0][0].toInt()..mapped[0][1].toInt(), mapped[1][0].toInt()..mapped[1][1].toInt())
        if(checkOverlap(ranges.first, ranges.second)){
            overlaps += 1
        }
        if(checkOverlap2(ranges.first, ranges.second)){
            overlaps2 += 1
        }
    }
    println(overlaps)
    println(overlaps2)
}

fun checkOverlap(range1: IntRange, range2: IntRange): Boolean {
    val inter = range1.intersect(range2)
    val size1 = (1 + range1.last) - range1.first
    val size2 = (1 + range2.last) - range2.first
    val size = if(size1 < size2){
        size1
    }
    else{
        size2
    }
    if(inter.size == size){
        return inter.isNotEmpty()
    }
    return false
}

fun checkOverlap2(range1: IntRange, range2: IntRange): Boolean {
    val inter = range1.intersect(range2)

    return inter.isNotEmpty()
}