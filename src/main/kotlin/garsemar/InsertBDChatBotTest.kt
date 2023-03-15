package garsemar

import java.sql.DriverManager
import java.util.Scanner
import kotlin.io.path.Path
import kotlin.io.path.listDirectoryEntries


fun main() {
    val scan = Scanner(System.`in`)
    println("Directory path:")
    // "src/main/kotlin/garsemar/categories"
    val files = Path(scan.next()).listDirectoryEntries()

    val url = "jdbc:postgresql://mel.db.elephantsql.com:5432/dbwhtout"
    val user = "dbwhtout"
    val password = "2rudKljGhyqgxvx5yLRCzZbCd1wrAk9y"

    val connection = DriverManager.getConnection(url, user, password)

    val statement = connection.createStatement()

    files.forEach { it ->
        val file: List<MutableList<String>> = it.toFile().readLines().drop(1).map { it.replace("\"", "").split(";").toMutableList() }
        val name = it.fileName.toString().split(".")[0].lowercase()

        val sql = """
         CREATE TABLE $name (
            ID serial primary key,
            nom varchar(500),
            informacion varchar(500),
            contacto varchar(500),
            horarios varchar(500),
            web varchar(500),
            direccion varchar(500)
            )
        """.trimMargin()

        if(!tableExists(connection, name)){
            statement.execute(sql)
        }

        for(i in file.indices){
            println(name)
            if(file[i].size < 6){
                file[i+1].forEach {
                    println("line: $i")
                    println("number: ${file[i].size}")
                    println(file[i])
                    file[i].add(it)
                }
                file.drop(i+1)
            }
            val insert = connection.prepareStatement(
            "insert into $name (nom, informacion, contacto, horarios, web, direccion)" +
                    "values (?, ?, ?, ?, ?, ?);"
            )
            insert.setString(1, file[i][0])
            insert.setString(2, file[i][1])
            insert.setString(3, file[i][2])
            insert.setString(4, file[i][3])
            insert.setString(5, file[i][4])
            insert.setString(6, file[i][5])

            insert.executeUpdate()
        }
    }

    statement.close()
    connection.close()
}