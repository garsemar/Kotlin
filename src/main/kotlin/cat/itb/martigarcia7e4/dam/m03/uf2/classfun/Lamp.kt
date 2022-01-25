package cat.itb.martigarcia7e4.dam.m03.uf2.classfun

import java.util.*

class Lamp{
    private var lampStatus = false
    val scan = Scanner(System.`in`)
    fun listen(){
        while(true){
            val text = scan.nextLine()
            if(text == "END") break
            check(text)
        }
    }
    private fun check(text: String){
        when(text){
            "TURN ON" -> turnO()
            "TURN OFF" -> turnF()
            "TOGGLE" -> toggle()
        }
    }
    private fun turnO(){
        lampStatus = true
        println(lampStatus)
    }
    private fun turnF(){
        lampStatus = false
        println(lampStatus)
    }
    private fun toggle(){
        if(lampStatus){
            lampStatus = false
            println(lampStatus)
        }
        else if(lampStatus == false){
            lampStatus = true
            println(lampStatus)
        }
    }
}

fun main(){
    val lamp = Lamp()
    lamp.listen()
}