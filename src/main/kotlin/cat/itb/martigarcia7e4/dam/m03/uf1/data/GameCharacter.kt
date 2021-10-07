package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.util.*

class Possition(var x: Int, var y: Int){
    fun possPrint(){
        println("Robot esta en x:$x, y:$y")
    }
}
class VidaR(var vidaM: Int){
    fun vidaPrint(){
        println("Robot te $vidaM de vida")
    }
}
class Bullet(){
    val possition : Possition = Possition(x = 1, y = 1)
}
class Robot() {
    val possition : Possition = Possition(x = 1, y = 1)
    val vida : VidaR = VidaR(vidaM = 5)

    val bullet : Bullet = Bullet()
    fun right(){
        possition.x += 1
    }
    fun left(){
        possition.x -= 1
    }
    fun up(){
        possition.y += 1
    }fun down(){
        possition.y -= 1
    }
    fun vidaRobot(){
        println("El robot tiene ${vida.vidaM} de vida")
        println(possition.x)
        println(possition.y)
    }
    fun disp(){
        bullet.possition.x = possition.x
        bullet.possition.y = possition.y
    }
}
fun main(){
    val scan = Scanner(System.`in`)
    //GameCharacter
    val robot = Robot()

    robot.right()
    robot.down()
    robot.vidaRobot()

}