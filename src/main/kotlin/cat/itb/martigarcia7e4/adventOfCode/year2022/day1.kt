package cat.itb.martigarcia7e4.adventOfCode.year2022

import java.io.File

fun main() {
    val listOfList = matrixOfFile()

    val defList = sumList(listOfList)

    println(defList.first())

    println(defList[0]+defList[1]+defList[2])
}

fun matrixOfFile(): MutableList<MutableList<Int>> {
    val file = File("src/main/resources/adventOfCode/input1.txt")

    val list = file.readLines()
    val listOfList = MutableList(list.size) { mutableListOf<Int>() }

    var j = 0
    for(i in list.indices) {
        if(list[i].isNotEmpty()){
            listOfList[j].add(list[i].toInt())
        }
        else{
            j += 1
        }
    }
    return listOfList
}

fun sumList(listOfList: MutableList<MutableList<Int>>): MutableList<Int> {
    val defList = mutableListOf<Int>()
    listOfList.removeIf { it.isEmpty() }
    for(i in listOfList.indices){
        defList.add(listOfList[i].sum())
    }
    defList.sortDescending()
    return defList
}