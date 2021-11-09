package cat.itb.martigarcia7e4.dam.m03.uf1.iterative

fun main(){
    var num = 1
    for(j in 1..9 step 1){
        for(i in 1..9 step 1){
            val num = j * i
            if(num < 10){
                print(" $num ")
            }else{
                print("$num ")
            }
        }
        print("\n")
    }
}