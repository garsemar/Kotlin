package garsemar

import java.sql.DriverManager

fun main() {
    val url = "jdbc:postgresql://trumpet.db.elephantsql.com:5432/rwndjpvi"
    val user = "rwndjpvi"
    val password = "xe7nhSHrlEA62i6n5EzzNeI5uUKUJ5Wa"

    val connection = DriverManager.getConnection(url, user, password)

    val statement = connection.createStatement()

    val query = connection.prepareStatement("select * from pg_tables where schemaname = 'public'")

    val result = query.executeQuery()

    while(result.next()){
        val name = result.getString("tablename")

        println(name)

        val sql = """
         drop table $name
        """.trimMargin()

        statement.execute(sql)
    }
}