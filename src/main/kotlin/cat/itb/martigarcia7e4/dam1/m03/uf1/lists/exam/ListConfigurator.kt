package cat.itb.martigarcia7e4.dam1.m03.uf1.lists.exam

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val list = MutableList(10){0}
    var pos = 0
    var num = 0

    while(true){
        pos = scan.nextInt()
        if(pos == -1) break
        num = scan.nextInt()
        if(num == -1) break
        list.add(pos, num)
    }
    print(list)
}