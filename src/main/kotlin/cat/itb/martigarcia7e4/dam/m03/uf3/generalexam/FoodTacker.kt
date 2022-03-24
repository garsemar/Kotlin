package cat.itb.martigarcia7e4.dam.m03.uf3.generalexam

import java.util.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import java.nio.file.Path
import kotlin.io.path.*

/**
 * Data class to store the json
 */
@Serializable
data class FoodTacker(val nom: String, val grams: Int, val kcal: Double)

/**
 * Class of functions to operate on the json
 */
class FoodTackerJSON {
    /**
     * Store the json information in a list of the data class.
     */
    fun getJson(path: Path): MutableList<FoodTacker> {
        val scan = Scanner(System.`in`)
        val foodTacker: MutableList<FoodTacker>

        if (path.exists()) {
            if (path.readLines().isNotEmpty()) {
                val preJson: MutableList<FoodTacker> = Json.decodeFromString(path.readText())
                foodTacker = preJson
                foodTacker.add(FoodTacker(scan.next(), scan.nextInt(), scan.nextDouble()))
            } else {
                foodTacker = mutableListOf(FoodTacker(scan.next(), scan.nextInt(), scan.nextDouble()))
            }
        } else {
            foodTacker = mutableListOf(FoodTacker(scan.next(), scan.nextInt(), scan.nextDouble()))
        }

        return foodTacker
    }

    /**
     * Store the data class list information in json
     */
    fun writeJson(path: Path, foodTacker: MutableList<FoodTacker>) {
        val json = Json.encodeToString(foodTacker)
        path.writeText(json)
    }
}

/**
 * Displays all items in the data class list on the screen.
 */
fun printFood(foodTacker: MutableList<FoodTacker>){
    for(food in foodTacker){
        println("${food.nom} ${food.grams}g, ${food.kcal*food.grams} kcal")
    }
}

/**
 * The main function
 */
fun main() {
    val homePath : String = System.getProperty("user.home")
    val path = Path("$homePath/food.json")
    val foodTackerJSON = FoodTackerJSON()

    val foodTacker = foodTackerJSON.getJson(path)
    printFood(foodTacker)
    foodTackerJSON.writeJson(path, foodTacker)
}