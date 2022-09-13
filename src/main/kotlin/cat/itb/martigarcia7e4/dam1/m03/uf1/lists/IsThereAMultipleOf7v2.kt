package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

fun main(){
    val values = listOf(4,8,9,40,54,84,40,6,84,1,1,68,84,68,4,840,684,25,40,98,54,687,31,4894,468,46,84687,894,40,846,1681,618,161,846,84687,6,848)

    val anyNegative = values.any { it < 0 }
    val allEven = values.all { it % 2 == 0 }
    val allLess6 = values.none { it > 6 }

    println(anyNegative)
    println(allEven)
    println(allLess6)
}