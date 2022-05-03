package cat.itb.martigarcia7e4.dam.m03.uf4.exam.gameenemies

class Zombies(name: String, life: Int, private val sound: String): Enemies(name, life){
    override fun attack(damage: Int) {
        if(life<=0) {
            println("L'enemic $name està mort")
        }
        else if(damage > life){
            life = 0
            println(sound)
            println("L'enemic $name està mort")
        }
        else{
            life -= damage
            println(sound)
            println("L'enemic $name té $life punts de vida després d'un atac de força $damage")
        }
    }
}