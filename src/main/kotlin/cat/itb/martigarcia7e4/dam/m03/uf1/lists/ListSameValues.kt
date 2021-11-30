package cat.itb.martigarcia7e4.dam.m03.uf1.lists

fun main(){
    val list = readIntList()
    val list2 = readIntList()
    var num = 0
    for(i in 1..list.size){
        if(list[i-1] == list2[i-1]){
            num += 1
        }
    }
    if(num == list.size){
        println("són iguals")
    }else{
        println("no són iguals")
    }
}