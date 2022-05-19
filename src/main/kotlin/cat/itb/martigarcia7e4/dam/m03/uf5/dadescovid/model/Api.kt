package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.*

@Serializable
data class Covid(val ID: String, val Message: String, val Global: Global, val Countries: List<Country>)

@Serializable
data class Global(val NewConfirmed: Int, val TotalConfirmed: Int, val NewDeaths: Int, val TotalDeaths: Int, val NewRecovered: Int, val TotalRecovered: Int)

@Serializable
data class Country(val Country: String, val CountryCode: String, val NewConfirmed: Int, val TotalConfirmed: Int, val NewDeaths: Int, val TotalDeaths: Int, val NewRecovered: Int, val TotalRecovered: Int, val Date: String)

class ApiConnect(private val url: String) {
    suspend fun getData(): Covid {
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