package cat.itb.martigarcia7e4.dam.m03.uf4.exam.gameenemies

sealed class Enemies(val name: String, var life: Int){
    abstract fun attack(damage: Int)
    override fun toString(): String {
        return "name: $name, live: $life"
    }
}