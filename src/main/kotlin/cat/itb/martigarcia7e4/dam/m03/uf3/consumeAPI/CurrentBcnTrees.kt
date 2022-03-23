package cat.itb.martigarcia7e4.dam.m03.uf3.consumeAPI

import cat.itb.martigarcia7e4.dam.m03.uf3.serializable.BcnTree
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

suspend fun main() {
    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
            })
        }
    }

    val trees: List<BcnTree> =
        client.get("https://opendata-ajuntament.barcelona.cat/resources/bcn/Arbrat/OD_Arbrat_Zona_BCN.json")

    println(trees.size)
}