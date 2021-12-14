package cat.itb.martigarcia7e4.dam.m03.uf1.lists

fun main() {
    val matrix = listOf(
        listOf(2,5,1,6),
        listOf(23,52,14,36),
        listOf(23,75,81,64)
    )
    var sum = 0
    for(i in 1..3){
        for(j in 1..matrix[i-1].size){
            sum += matrix[i-1][j-1]
        }
    }
    println(sum)
}