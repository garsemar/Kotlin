package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid

import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*

class ApiConnect() {
    suspend fun getCovidData(): Covid {
        val client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                })
            }
        }
        return client.get("https://api.covid19api.com/summary")
    }

    suspend fun getCountryCode(): List<CountryCode> {
        val client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                })
            }
        }
        return client.get("https://centellas.gitlab.io/teachingSite/DAM-M03/UF5/exercicis/files/population.json")
    }

    suspend fun getCountryTranslate(): List<CountryTranslate> {
        val client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                })
            }
        }
        return client.get("https://centellas.gitlab.io/teachingSite/DAM-M03/UF5/exercicis/files/country_codes.json")
    }
}