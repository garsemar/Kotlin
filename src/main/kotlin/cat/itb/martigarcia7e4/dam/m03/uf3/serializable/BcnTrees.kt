package cat.itb.martigarcia7e4.dam.m03.uf3.serializable

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.*
import java.util.*

@Serializable
data class BcnTree(val nom_cientific: String)

suspend fun main() {
    val scan = Scanner(System.`in`)
    val typeTree = scan.nextLine()

    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
            })
        }
    }

    val trees: List<BcnTree> =
        client.get("https://centellas.gitlab.io/teachingSite/DAM-M03/UF3/exercicis/files/OD_Arbrat_Zona_BCN.json")
    var count = 0
    for(tree in trees){
        if(tree.nom_cientific == typeTree){
            count += 1
        }
    }
    println(count)
}