package cat.itb.martigarcia7e4.dam1.m03.uf2.functions
import java.util.*
import java.util.Collections.max

data class OldestStudent(val list: MutableList<Int>){
    fun old(): Int {
        return max(this.list)
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while(true){
        val si = scan.nextInt()
        if(si == -1)break
        list.add(si)
    }
    val oldest = OldestStudent(list)
    print("L'alumne més gran té ${oldest.old()} anys")
}