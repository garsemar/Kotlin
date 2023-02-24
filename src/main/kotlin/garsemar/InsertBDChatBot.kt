package garsemar

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.Scanner
import kotlin.io.path.Path
import kotlin.io.path.listDirectoryEntries


fun main() {
    val scan = Scanner(System.`in`)
    println("Directory path:")
    // "src/main/kotlin/garsemar/categories"
    val files = Path(scan.next()).listDirectoryEntries()

    val url = "jdbc:postgresql://trumpet.db.elephantsql.com:5432/rwndjpvi"
    val user = "rwndjpvi"
    val password = "xe7nhSHrlEA62i6n5EzzNeI5uUKUJ5Wa"

    val connection = DriverManager.getConnection(url, user, password)

    val statement = connection.createStatement()

    files.forEach { it ->
        val file = it.toFile().readLines().drop(1).map { it.replace("\"", "").split(";") }
        val name = it.fileName.toString().split(".")[0].lowercase()

        val sql = """
         CREATE TABLE $name (
            ID serial primary key,
            nom varchar(100),
            informacion varchar(300),
            contacto varchar(100),
            horarios varchar(100),
            web varchar(100),
            direccion varchar(100)
            )
        """.trimMargin()

        if(!tableExists(connection, name)){
            statement.execute(sql)
        }

        for(i in file){
            val insert = connection.prepareStatement(
            "insert into $name (nom, informacion, contacto, horarios, web, direccion)" +
                    "values (?, ?, ?, ?, ?, ?);"
            )
            insert.setString(1, i[0])
            insert.setString(2, i[1])
            insert.setString(3, i[2])
            insert.setString(4, i[3])
            insert.setString(5, i[4])
            insert.setString(6, i[5])

            insert.executeUpdate()
        }
    }

    statement.close()
    connection.close()
}

@Throws(SQLException::class)
fun tableExists(connection: Connection, tableName: String?): Boolean {
    val preparedStatement = connection.prepareStatement(
        "SELECT count(*) "
                + "FROM information_schema.tables "
                + "WHERE table_name = ?"
                + "LIMIT 1;"
    )
    preparedStatement.setString(1, tableName)
    val resultSet = preparedStatement.executeQuery()
    resultSet.next()
    return resultSet.getInt(1) != 0
}