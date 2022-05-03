package cat.itb.martigarcia7e4.dam.m03.uf4.exam.gameenemies

class Troll(name: String, life: Int, private val resistance: Int): Enemies(name, life){
    override fun attack(damage: Int) {
        if(life<=0) {
            println("L'enemic $name està mort")
            return
        } else if(damage > resistance){
            life -= (damage-resistance)
        }
        println("L'enemic $name té $life punts de vida després d'un atac de força $damage")
    }
}