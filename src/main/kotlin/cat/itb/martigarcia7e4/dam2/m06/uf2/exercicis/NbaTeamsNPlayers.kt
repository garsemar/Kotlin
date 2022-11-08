package cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis

import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.height
import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.name
import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.nameiteam
import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.weight
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

object players: IntIdTable(){
    val name = varchar("name", 30)
    val height = varchar("height", 4)
    val weight = integer("weight")
    val position = varchar("position", 12)
    val nameiteam = varchar("nameiteam", 20) references teams.name
}

object teams: Table(){
    val name = varchar("name", 20)
    val city = varchar("city", 20)
    val conference = varchar("conference", 4)
    val division = varchar("division", 9)
    override val primaryKey = PrimaryKey(name, name = "PK_teams")
}

fun main() {
    Database.connect("jdbc:postgresql://sv.garsemar.com:5432/Kotlin", driver = "org.postgresql.Driver", user = "garsemar", password = "sserra12")

    transaction {
        //SchemaUtils.create(Entrenament2)

        /*val scan = Scanner(System.`in`)

        Entrenament.insert {
            it[name] = scan.next()
            it[duration] = scan.nextInt()
        } get Entrenament.id*/

        val query: Query = players.selectAll()

        val teams1 = mutableListOf<String>()

        query.forEach {
            if(it[nameiteam] !in teams1){
                teams1.add(it[nameiteam])
            }
        }

        //println(teams)
        val awd = players.join(teams, JoinType.INNER, additionalConstraint = {teams.name eq players.nameiteam})
            .slice(name, teams.city)
            .selectAll()

        awd.forEach {
            println(it)
        }

        /*query.forEach {
            println(it[name])
            println(it[height])
            println(it[weight])
            println(it[nameiteam])
        }*/
    }
}