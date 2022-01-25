package cat.itb.martigarcia7e4.dam.m03.uf2.classfun

import java.util.*

data class BasicRobot(var posX: Double = 0.0, var posY: Double = 0.0, var speed: Double = 1.0){
    val scan = Scanner(System.`in`)
    fun listen(){
        while(true){
            val order = scan.next()
            if(order == "END") break
            check(order)
        }
    }
    private fun check(order: String){
        when(order){
            "DALT" -> dalt()
            "BAIX" -> baix()
            "DRETA" -> dreta()
            "ESQUERRA" -> esquerra()
            "ACCELERAR" -> accelerar()
            "DISMINUIR" -> disminuir()
            "POSICIO" -> posicio()
            "VELOCITAT" -> velocitat()
        }
    }
    private fun dalt(){
        posY += speed
    }
    private fun baix(){
        posY -= speed
    }
    private fun dreta(){
        posX += speed
    }
    private fun esquerra(){
        posX -= speed
    }
    private fun accelerar(){
        if(speed < 10) speed += 0.5
        else{
            println("No es pot accelerar mes")
        }
    }
    private fun disminuir(){
        if(speed > 0) speed -= 0.5
        else{
            println("No pots disminuir mes la velocitat")
        }
    }
    private fun posicio(){
        println("La posició del robot és ($posX, $posY)")
    }
    private fun velocitat(){
        println("La velocitat del robot és $speed")
    }
}

fun main(){
    val robot = BasicRobot()
    robot.listen()
}