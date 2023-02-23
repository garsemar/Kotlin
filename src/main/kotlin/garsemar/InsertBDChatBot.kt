package garsemar

import java.sql.Connection
import java.sql.DatabaseMetaData
import java.sql.DriverManager
import java.sql.SQLException
import kotlin.io.path.Path
import kotlin.io.path.listDirectoryEntries

fun main() {
    val files = Path("src/main/kotlin/garsemar/categories").listDirectoryEntries()

    val url = "jdbc:postgresql://trumpet.db.elephantsql.com:5432/rwndjpvi"
    val user = "rwndjpvi"
    val password = "xe7nhSHrlEA62i6n5EzzNeI5uUKUJ5Wa"

    val connection = DriverManager.getConnection(url, user, password)

    val statement = connection.createStatement()

    files.forEach { it ->
        val file = it.toFile().readLines().map { it.replace("\"", "").split(";") }
        val name = it.fileName.toString().split(".")[0]

        val sql = """
         CREATE TABLE $name (
            ID serial primary key,
            nom varchar(100),
            informacion varchar(200),
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
            for(j in i){
                val insert = """
                    insert into $name values (${j[0]}, ${j[1]}, ${j[2]}, ${j[3]}, ${j[4]}, ${j[5]})
                """.trimMargin()

                statement.execute(insert)
            }
        }
    }

    statement.close()
    connection.close()
}

@Throws(SQLException::class)
fun tableExists(connection: Connection, tableName: String?): Boolean {
    val meta: DatabaseMetaData = connection.metaData
    val resultSet = meta.getTables(null, null, tableName, arrayOf("TABLE"))
    return resultSet.next()
}