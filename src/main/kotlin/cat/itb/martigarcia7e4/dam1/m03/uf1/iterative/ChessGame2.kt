package cat.itb.martigarcia7e4.dam1.m03.uf1.iterative

import java.util.*

fun mostrarTauler2(num:Int){
    if(num % 2 == 0){
        for(i in 1..num step 2){
            for(j in 1..num step 2){
                print(" ⬛ ")
                print(" □ ")
            }
            print("\n")
            for(j in 1..num step 2){
                print(" □ ")
                print(" ⬛ ")
            }
            print("\n")
        }
    }else{
        for(i in 1 until num step 2){
            for(j in 1 until num step 2){
                print(" ⬛ ")
                print(" □ ")
            }
            print(" ⬛ ")
            print("\n")
            for(j in 1 until num step 2){
                print(" □ ")
                print(" ⬛ ")
            }
            print(" □ ")
            print("\n")
        }
        for(x in 1 until num step 2){
            print(" ⬛ ")
            print(" □ ")
        }
        print(" ⬛ ")
    }
}

fun main(){
    val scan = Scanner(System.`in`)
    print("Introdueix un numero: ")
    val num = scan.nextInt()
    mostrarTauler2(num)
}