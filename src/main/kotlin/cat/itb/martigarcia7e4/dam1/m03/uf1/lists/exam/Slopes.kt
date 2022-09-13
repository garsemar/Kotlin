package cat.itb.martigarcia7e4.dam1.m03.uf1.lists.exam

fun slopes(){
    val list = listReader()
    var changes = 0
    var inf = 10
    for(i in 1 until list.size){
        if(list[i-1] < list[i]){
            if(inf == 0){
                changes++
            }
            inf = 1
        }else if(list[i-1] > list[i]){
            if(inf == 1){
                changes++
            }
            inf = 0
        }
    }
    println("Té $changes canvis de pendents.")
}

fun main() {
    slopes()
}