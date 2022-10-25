package cat.itb.martigarcia7e4.dam2.m06.uf2.exercicis

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.time.LocalDateTime

object Time: IntIdTable() {
    val hour = varchar("hour", 30)
}

fun main() {
    Database.connect("jdbc:h2:./h2dbfile", driver = "org.h2.Driver")

    transaction {
        SchemaUtils.create(Time)

        Time.insert {
            it[hour] = LocalDateTime.now().toString()
        } get Time.id

        val query: Query = Time.selectAll()
        query.forEach { println("${it[Time.id]}: ${it[Time.hour]}") }
    }
}