package cat.itb.martigarcia7e4.dam.m03.uf6.beachapp.data

import java.sql.Connection
import java.sql.DriverManager


const val databaseFile = "beach.db"
class BeachDB {
    var connection: Connection? = null

    fun connect(): Connection {
        connection = DriverManager.getConnection("jdbc:sqlite:$databaseFile")
        return connection!!
    }
}