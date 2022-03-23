package cat.itb.martigarcia7e4.dam.m03.uf3.serializable

import kotlinx.serialization.SerialName
import java.util.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.io.path.*

@Serializable
data class BuyList(val quantitat: Int, val nom: String, val preu: Double)

fun main() {
    val scan = Scanner(System.`in`)
    val path = Path("src/main/kotlin/cat/itb/martigarcia7e4/dam/m03/uf3/resources/buyList.json")

    var preJson: MutableList<BuyList>? = null
    if(path.exists()) {
        preJson = Json.decodeFromString(path.readText())
    }

    val buyList: MutableList<BuyList>? = preJson

    println(buyList)

    //buyList.add(BuyList(scan.nextInt(), scan.next(), scan.nextDouble()))

    val json = Json.encodeToString(buyList)
    path.writeText(json)
}