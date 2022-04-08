package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.inter.bcntrees

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.util.*
import kotlin.io.path.Path
import kotlin.io.path.readText

interface BcnTreesDataSource{
    suspend fun listTrees(): List<BcnTree>
}

class APIBcnTreesDataSource(): BcnTreesDataSource{
    override suspend fun listTrees(): List<BcnTree> {
        val client = HttpClient(CIO) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                })
            }
        }
        return client.get("https://opendata-ajuntament.barcelona.cat/resources/bcn/Arbrat/OD_Arbrat_Zona_BCN.json")
    }
}
class LocalBcnTreesDataSource(): BcnTreesDataSource{
    private val json = Json { ignoreUnknownKeys = true }

    override suspend fun listTrees(): List<BcnTree> {
        val path = Path("src/main/kotlin/cat/itb/martigarcia7e4/dam/m03/uf4/resources/OD_Arbrat_Zona_BCN.json")

        return json.decodeFromString(path.readText())
    }
}

@Serializable
data class BcnTree(val nom_cientific: String)

suspend fun main() {
    val scan = Scanner(System.`in`)
    val jsonType = scan.nextLine()
    val typeTree = scan.nextLine()

    val useApi: Boolean = jsonType != "LOCAL"
    val bcnTreeDataSource : BcnTreesDataSource = if(useApi) APIBcnTreesDataSource() else LocalBcnTreesDataSource()
    val trees = bcnTreeDataSource.listTrees()

    var count = 0
    for(tree in trees){
        if(tree.nom_cientific == typeTree){
            count += 1
        }
    }
    println(count)
}
