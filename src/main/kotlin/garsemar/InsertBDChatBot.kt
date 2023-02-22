package garsemar

import java.io.File
import java.sql.DriverManager

fun main() {
    val file = File("src/main/kotlin/garsemar/Salut.csv").readLines().map { it.replace("\"", "").split(";") }

    println(file[0])
    println(file[3])

    val url = "jdbc:postgresql://sv.garsemar.com:5432/Kotlin"
    val user = "garsemar"
    val password = "sserra12"

    val connection = DriverManager.getConnection(url, user, password)

    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT * FROM players")
    while (resultSet.next()) {
        val columna1 = resultSet.getString("name")
        val columna2 = resultSet.getString("origin")
        // procesar los datos obtenidos de la consulta

        println("$columna1, $columna2")
    }

    resultSet.close()
    statement.close()
    connection.close()
}