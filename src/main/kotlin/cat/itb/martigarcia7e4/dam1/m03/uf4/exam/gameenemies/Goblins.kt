package cat.itb.martigarcia7e4.dam1.m03.uf4.exam.gameenemies

class Goblins(name: String, life: Int): Enemies(name, life){
    override fun attack(damage: Int) {
        life -= if(life<=0/*|| damage > life*/) {
            println("L'enemic $name està mort")
            return
        } else if(damage < 4){
            1
        } else{
            5
        }
        println("L'enemic $name té $life punts de vida després d'un atac de força $damage")
    }
}