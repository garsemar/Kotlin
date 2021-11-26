package cat.itb.martigarcia7e4.dam.m03.uf1.lists

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val num = scan.nextInt()
    var smaller = true
    var i = 0
    val element = scan.nextInt()
    var found = false
    val list = List(num){scan.nextInt()}

    while(smaller && i<list.size && !found){
        if(element == list[i]){
            found=true
        }else if(element>list[i]){
            smaller=false
        }
        i++
    }
}