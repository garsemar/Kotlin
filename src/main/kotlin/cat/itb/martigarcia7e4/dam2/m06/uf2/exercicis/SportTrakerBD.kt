package cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

object Entrenament: IntIdTable(){
    val name = varchar("name", 20)
    val duration = integer("duration")
}

fun main() {
    Database.connect("jdbc:h2:./h2dbfile", driver = "org.h2.Driver")

    transaction {
        SchemaUtils.create(Entrenament)

        val scan = Scanner(System.`in`)

        Entrenament.insert {
            it[name] = scan.next()
            it[duration] = scan.nextInt()
        } get Entrenament.id

        val query: Query = Entrenament.selectAll()

        println("Duracio total: ${query.sumOf { it[Entrenament.duration] }}")
        println("Total per sport: ${totalPerSport(query)}")
    }
}

fun totalPerSport(query: Query): List<Pair<String, Int>> {
    return query.groupBy { it[Entrenament.name] }.map {
            it -> it.key to it.value.sumOf { it[Entrenament.duration] }
    }
}