package cat.itb.martigarcia7e4.dam2.m06.uf3.exercicis

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.MongoClientSettings.getDefaultCodecRegistry
import com.mongodb.ServerApi
import com.mongodb.ServerApiVersion
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Accumulators
import com.mongodb.client.model.Aggregates
import com.mongodb.client.model.Aggregates.group
import com.mongodb.client.model.Filters
import org.bson.codecs.configuration.CodecRegistries.fromProviders
import org.bson.codecs.configuration.CodecRegistries.fromRegistries
import org.bson.codecs.pojo.PojoCodecProvider
import org.bson.types.ObjectId
import java.util.*
import java.util.function.Consumer


data class Item(
    var _id: ObjectId = ObjectId.get(),
    var sport: String = "null",
    var duration_minutes: Int = 0)

fun main() {
    val scan = Scanner(System.`in`)
    val pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build()
    val pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider))
    val connectionString =
        ConnectionString("mongodb+srv://itb:contrasenyamuysegura@kotlin.evyqmbe.mongodb.net/?retryWrites=true&w=majority")
    val settings: MongoClientSettings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .serverApi(
            ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build()
        )
        .build()
    val mongoClient: MongoClient = MongoClients.create(settings)

    val database: MongoDatabase = mongoClient.getDatabase("Kotlin")
        .withCodecRegistry(pojoCodecRegistry);
    val collection: MongoCollection<Item> = database.getCollection("sports", Item::class.java)

    val item = Item(sport = scan.next(), duration_minutes = scan.nextInt())
    collection.insertOne(item)

    database.getCollection("sports").aggregate(listOf(group("\$sport", Accumulators.sum("sum", "\$duration_minutes")))
    ).forEach(Consumer { doc ->
        System.out.println(
            doc.toJson()
        )
    })
}