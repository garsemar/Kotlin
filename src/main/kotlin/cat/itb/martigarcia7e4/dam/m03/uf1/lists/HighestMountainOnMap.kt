package cat.itb.martigarcia7e4.dam.m03.uf1.lists

data class HighestMountain(var maxX:Int, var maxY:Int)

fun main() {
    val mount = HighestMountain(0, 0)
    val map =listOf(
        listOf(1.5,1.6,1.8,1.7,1.6),
        listOf(1.5,2.6,2.8,2.7,1.6),
        listOf(1.5,4.6,4.4,4.9,1.6),
        listOf(2.5,1.6,3.8,7.7,3.6),
        listOf(1.5,2.6,3.8,2.7,1.6)
    )
    var num = 0.0
    for(i in 0..map.lastIndex){
        for(j in 0..map[i].lastIndex){
            if(map[i][j] > num){
                mount.maxY = i
                mount.maxX = j
                num = map[i][j]
            }
        }
    }
    println("${mount.maxX}, ${mount.maxY}: $num metres")
}