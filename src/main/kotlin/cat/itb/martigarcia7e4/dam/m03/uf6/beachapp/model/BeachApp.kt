package cat.itb.martigarcia7e4.dam.m03.uf6.beachapp.model

import cat.itb.martigarcia7e4.dam.m03.uf6.beachapp.data.BeachDAO
import cat.itb.martigarcia7e4.dam.m03.uf6.beachapp.data.BeachDB
import java.util.Scanner

class BeachApp(val scan: Scanner) {
    private val beachDB = BeachDB()
    private val beachDAO = BeachDAO(beachDB)
    init {
        beachDB.connect()
        beachDAO.createTableIfNotExists()
    }
    fun addBeach(id: Int, name: String, city: String, waterQuality: Float){
        beachDAO.insert(Beach(id, name, city, waterQuality))
    }
    fun listBeaches(): List<Beach> {
        return beachDAO.list()
    }
    fun modifyQuality(id: Int, waterQuality: Float) {
        val beach = beachDAO.findById(id)
        beach.waterQuality = waterQuality
        beachDAO.update(beach)
    }
    fun resum(): Map<String, Float> {
        return beachDAO.averageWaterQualityByCity().toList().sortedByDescending { (_, value) -> value}.toMap()

    }
}