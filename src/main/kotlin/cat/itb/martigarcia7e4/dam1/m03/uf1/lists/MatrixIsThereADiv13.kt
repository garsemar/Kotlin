package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

fun main() {
    val matrix = listOf(
        listOf(2,5,1,6),
        listOf(23,52,14,36),
        listOf(23,75,81,62)
    )
    for(i in 0..matrix.lastIndex){
        for(j in 0..matrix[i].lastIndex){
            if(matrix[i][j] % 13 == 0){
                println("true")
                return
            }
        }
    }
    println("false")
}