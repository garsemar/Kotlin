package cat.itb.martigarcia7e4.dam.m03.uf1.iterative

fun mostrarTauler(){
    for(i in 1..8 step 1){
        for(j in 1..8 step 1){
            print("   ")
            print("[■]")
        }
        print("\n")
        for(j in 1..8 step 1){
            print("[■]")
            print("   ")
        }
        print("\n")
    }
}

fun main(){
    mostrarTauler()
}