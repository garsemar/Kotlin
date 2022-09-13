package cat.itb.martigarcia7e4.dam2.m06.uf1.repas


import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.Serializable
import java.util.Scanner

@Serializable
data class Person(val name: String, val age: Int)

class GetApiData(private val url: String){
    suspend fun getApi(): Person {
        val client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                })
            }
        }
        return client.get(url)
    }
}

suspend fun main() {
    val scan = Scanner(System.`in`)
    println("Ben vingut al AgeMagician. Com et dius?")
    val name = scan.next()
    val getApiData = GetApiData("https://api.agify.io/?name=$name&country_id=ES")
    println("Jo crec que tens ${getApiData.getApi().age} anys!")
}