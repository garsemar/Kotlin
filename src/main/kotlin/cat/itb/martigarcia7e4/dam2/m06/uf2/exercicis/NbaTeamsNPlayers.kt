package cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis

import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.height
import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.name
import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.nameiteam
import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.players.weight
import cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis.teams.division
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

object players : IntIdTable() {
    val name = varchar("name", 30)
    val height = varchar("height", 4)
    val weight = integer("weight")
    val position = varchar("position", 12)
    val nameiteam = varchar("nameiteam", 20) references teams.name
}

object teams : Table() {
    val name = varchar("name", 20)
    val city = varchar("city", 20)
    val conference = varchar("conference", 4)
    val division = varchar("division", 9)
    override val primaryKey = PrimaryKey(name, name = "PK_teams")
}

fun main() {
    Database.connect(
        "jdbc:postgresql://sv.garsemar.com:5432/Kotlin",
        driver = "org.postgresql.Driver",
        user = "garsemar",
        password = "sserra12"
    )

    val scan = Scanner(System.`in`)

    transaction {
        println(findCity(scan))
        tallestPlayers()
    }
}

fun allTeams(): MutableList<String> {
    val teams1 = mutableListOf<String>()
    val query: Query = players.selectAll()

    query.forEach {
        if (it[nameiteam] !in teams1) {
            teams1.add(it[nameiteam])
        }
    }

    return teams1
}

fun findCity(scan: Scanner): String? {
    val player = players.join(teams, JoinType.INNER, additionalConstraint = {teams.name eq players.nameiteam})
        .slice(name, teams.city)
        .selectAll()

    return player.map { it[name] to it[teams.city] }.find { it.first == scan.nextLine() }?.second
}

fun tallestPlayers() {
    val team = allTeams()
    val player = players.join(teams, JoinType.INNER, additionalConstraint = {teams.name eq players.nameiteam})
        .slice(name, height, nameiteam, division)
        .selectAll()

    val player2 = player.filter { it[division] == "Atlantic" }.map { it[name] to listOf(it[height], it[nameiteam], it[division]) }

    for(i in team.indices){
        val pla = player2.filter { it.second[1] == team[i] }
        if(pla.isNotEmpty()){
            val result = pla.maxBy { it.second[0] }
            println("${result.second[1]}: ${result.first},  ${result.second[0]}")
        }
    }
}