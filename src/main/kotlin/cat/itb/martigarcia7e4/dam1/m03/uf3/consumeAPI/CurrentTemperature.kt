package cat.itb.martigarcia7e4.dam1.m03.uf3.consumeAPI

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentTemperature(
    @SerialName("name") val name: String,
    @SerialName("main") val main: Main)

@Serializable
data class Main(
    @SerialName("temp") val temp: Double,
    @SerialName("humidity") val humidity: Int)

suspend fun main() {
    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
            })
        }
    }

    val temp: CurrentTemperature =
        client.get("http://api.openweathermap.org/data/2.5/weather?lat=41.390205&lon=2.154007&appid=d662e754d0671e1384f22d2d9023795d")
    println("Bon dia,")
    println("Avui fa ${String.format("%.2f", temp.main.temp-273.15)}º a la ciutat de ${temp.name} amb una humitat del ${temp.main.humidity}%.")
}