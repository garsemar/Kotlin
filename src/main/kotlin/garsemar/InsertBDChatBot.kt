package garsemar

import java.sql.DriverManager
import java.util.Scanner
import kotlin.io.path.Path
import kotlin.io.path.listDirectoryEntries


fun main() {
    val scan = Scanner(System.`in`)
    println("Directory path:")
    // "src/main/kotlin/garsemar/categories"
    val files = Path(scan.next()).listDirectoryEntries().sortedBy { it.fileName.toString().split(" ")[0].toInt() }

    val url = "jdbc:postgresql://trumpet.db.elephantsql.com:5432/rwndjpvi"
    val user = "rwndjpvi"
    val password = "xe7nhSHrlEA62i6n5EzzNeI5uUKUJ5Wa"

    val connection = DriverManager.getConnection(url, user, password)

    val statement = connection.createStatement()

    val sqlCat = """
         CREATE TABLE categories (
            ID serial primary key,
            nom varchar(500)
            )
        """.trimMargin()
    if(!tableExists(connection, "categories")){
        println("cat")
        statement.execute(sqlCat)
    }
    val sqlItems = """
         CREATE TABLE items (
            ID serial primary key,
            idCat integer,
            nom varchar(500),
            informacion varchar(500),
            contacto varchar(500),
            horarios varchar(500),
            web varchar(500),
            direccion varchar(500),
            
            constraint fk_categories foreign key (idCat) references categories(ID)
            )
        """.trimMargin()
    if(!tableExists(connection, "items")){
        println("items")
        statement.execute(sqlItems)
    }

    val sqlEvents = """
         CREATE TABLE items (
            ID serial primary key,
            idCat integer,
            nom varchar(500),
            informacion varchar(500),
            contacto varchar(500),
            horarios varchar(500),
            web varchar(500),
            direccion varchar(500),
            
            constraint fk_categories foreign key (idCat) references categories(ID)
            )
        """.trimMargin()
    if(!tableExists(connection, "items")){
        println("items")
        statement.execute(sqlItems)
    }

    files.forEach { it ->
        val file: List<MutableList<String>> = it.toFile().readLines().drop(1).map { it.replace("\"", "").split(";").toMutableList() }
        val name = it.fileName.toString().split(" ")[1].split(".")[0].lowercase()

        println(name)

        val insertCat = connection.prepareStatement(
            "insert into categories (nom)" +
                    "values (?);"
            )
        insertCat.setString(1, name)
        insertCat.executeUpdate()

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

            val idCatSQL = connection.prepareStatement(
                "SELECT id "
                        + "FROM categories "
                        + "WHERE nom = ?;"
            )
            idCatSQL.setString(1, name)
            val resultSet = idCatSQL.executeQuery()
            resultSet.next()
            val idCat = resultSet.getInt(1)

            val insert = connection.prepareStatement(
            "insert into items (nom, idCat, informacion, contacto, horarios, web, direccion)" +
                    "values (?, ?, ?, ?, ?, ?, ?);"
            )
            insert.setString(1, file[i][0])
            insert.setInt(2, idCat)
            insert.setString(3, file[i][1])
            insert.setString(4, file[i][2])
            insert.setString(5, file[i][3])
            insert.setString(6, file[i][4])
            insert.setString(7, file[i][5])

            insert.executeUpdate()
        }
    }

    statement.close()
    connection.close()
}