package cat.itb.martigarcia7e4.dam.m03.uf4.exam.gameenemies

fun createEnemies(): List<Enemies> {
    return listOf(
        Zombies("Zog", 10, "AARRRrrgg"),
        Zombies("Lili", 30, "GRAaaArg"),
        Troll("Jum", 12, 5),
        Goblins("Tim", 60)
    )
}

fun main() {
    val enemies = createEnemies()
    enemies[0].attack(5)
    enemies[0].attack(7)
    enemies[3].attack(7)
    enemies[1].attack(3)
    enemies[2].attack(4)
    enemies[2].attack(8)
    enemies[1].attack(4)
    enemies[0].attack(5)
    enemies[0].attack(1)
    enemies[2].attack(1)
    enemies[2].attack(1)
    enemies[2].attack(1)
    println(enemies)
}