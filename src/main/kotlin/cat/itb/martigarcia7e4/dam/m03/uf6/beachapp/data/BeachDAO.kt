package cat.itb.martigarcia7e4.dam.m03.uf6.beachapp.data

import cat.itb.martigarcia7e4.dam.m03.uf6.beachapp.model.Beach
import java.sql.Connection
import java.sql.ResultSet

class BeachDAO(val database: BeachDB) {
    val connection: Connection get() = database.connection!!

    fun createTableIfNotExists() {
        val createQuery = "CREATE TABLE IF NOT EXISTS beach(id INTEGER PRIMARY KEY, beachName VARCHAR, city VARCHAR, waterQuality INTEGER)"
        val createStatement = connection.prepareStatement(createQuery)
        createStatement.execute()
    }

    fun list(): List<Beach> {
        val query = "SELECT * FROM beach"
        val listStatement = connection.createStatement()
        val resultat: ResultSet = listStatement.executeQuery(query)
        return toRectangleList(resultat)
    }

    fun insert(beach: Beach) {
        val query = "INSERT INTO beach(id, beachName, city, waterQuality) VALUES(?, ?, ?, ?)"
        val statment = connection.prepareStatement(query)
        statment.setInt(1, beach.id)
        statment.setString(2, beach.name)
        statment.setString(3, beach.city)
        statment.setInt(4, beach.waterQuality)
        statment.execute()
    }

    fun update(beach: Beach) {
        val query = "INSERT INTO beach(id, beachName, city, waterQuality) VALUES(?, ?, ?, ?)"
        val statment = connection.prepareStatement(query)
        statment.setInt(1, beach.id)
        statment.setString(2, beach.name)
        statment.setString(3, beach.city)
        statment.setInt(4, beach.waterQuality)
        statment.execute()
    }

    /**
     * Converts result set to list of rectangles
     */
    private fun toRectangleList(result: ResultSet): List<Beach> {
        val list: MutableList<Beach> = mutableListOf()
        while (result.next()) {
            list += toBeach(result)
        }
        return list
    }

    /**
     * Converts result set to a rectangle on the current position of the set
     */
    private fun toBeach(result: ResultSet): Beach {
        val id = result.getInt("id")
        val name = result.getString("beachName")
        val city = result.getString("city")
        val waterQuality = result.getInt("waterQuality")
        return Beach(id, name, city, waterQuality)
    }

    fun findById(id: Int) {
        TODO("Not yet implemented")
    }
}