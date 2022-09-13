package cat.itb.martigarcia7e4.dam1.m03.uf3.serializable

import java.util.*
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlin.io.path.*

@Serializable
data class BuyList(val quantitat: Int, val nom: String, val preu: Double)

fun main() {
    val scan = Scanner(System.`in`)
    val path = Path("src/main/kotlin/cat/itb/martigarcia7e4/dam/m03/uf3/resources/buyList.json")

    val buyList: MutableList<BuyList>

    if(path.readLines().isNotEmpty()){
        val preJson: MutableList<BuyList> = Json.decodeFromString(path.readText())
        buyList = preJson
        buyList.add(BuyList(scan.nextInt(), scan.next(), scan.nextDouble()))
    }
    else{
        buyList = mutableListOf(BuyList(scan.nextInt(), scan.next(), scan.nextDouble()))
    }

    var preu: Double
    val preuList = mutableListOf<Double>()
    println("-------- Compra --------")
    for(item in buyList){
        preu = item.preu * item.quantitat
        preuList.add(preu)
        println("${item.quantitat} ${item.nom} (${item.preu}€) - ${preu}€")
    }
    preu = 0.00
    for(item in preuList){
        preu += item
    }
    println("-------------------------")
    println("Total: ${preu}€")
    println("-------------------------")

    val json = Json.encodeToString(buyList)
    path.writeText(json)
}