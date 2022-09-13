package cat.itb.martigarcia7e4.dam1.m03.uf1.lists

fun main(){
    val list = MutableList(50){0.0f}

    list[0] = 31.0f
    list[1] = 56.0f
    list[19] = 12.0f
    list[49] = 79.0f

    println(list)
}