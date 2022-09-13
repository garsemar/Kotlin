package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

fun main() {
    val num1 = 3.3f
    val map = listOf(
        mutableListOf(1.5,1.6,1.8,1.7,1.6),
        mutableListOf(1.5,2.6,2.8,2.7,1.6),
        mutableListOf(1.5,4.6,4.4,4.9,1.6),
        mutableListOf(2.5,1.6,3.8,7.7,3.6),
        mutableListOf(1.5,2.6,3.8,2.7,1.6)
    )
    for(i in 0..map.lastIndex) {
        for (j in 0..map[i].lastIndex) {
            map[i][j] *= 3.2808
            println(String.format("%.2f", map[i][j]))
        }
    }
    println(map)
}