package garsemar

import java.sql.Connection
import java.sql.SQLException

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