package cat.itb.martigarcia7e4.dam1.m03.uf3.serializable

import kotlinx.serialization.json.Json
import kotlinx.serialization.*
import kotlin.io.path.Path
import kotlin.io.path.readText

@Serializable
data class Rectangle(val width: Double, val height: Double, val color: Color)

@Serializable
data class Color(val name: String)

/*@Serializable
data class Rectangle (
    @SerialName("width") var width: Double? = null,
    @SerialName("height") var height: Double? = null,
    @SerialName("color") var color: Color? = Color()
)

@Serializable
data class Color (
    @SerialName("name") var name: String? = null
)*/

fun main() {
    val path = Path("src/main/kotlin/cat/itb/martigarcia7e4/dam/m03/uf3/resources/rectangle.json")

    val rectangle = Json.decodeFromString<List<Rectangle>>(path.readText())

    for(i in rectangle){
        println("Un rectangle de ${i.width} x ${i.height} té ${Math.round((i.width*i.height)*10.00) / 10.00} d'area.")
    }
}