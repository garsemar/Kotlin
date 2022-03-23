package cat.itb.martigarcia7e4.dam.m03.uf3.consumeAPI

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.*

@Serializable
data class RandomQuote(
    @SerialName("content") val content: String,
    @SerialName("author") val author: String)

suspend fun main() {
    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
            })
        }
    }

    val quotes: RandomQuote =
        client.get("https://api.quotable.io/random")
    println("${quotes.author}:")
    println(quotes.content)
}