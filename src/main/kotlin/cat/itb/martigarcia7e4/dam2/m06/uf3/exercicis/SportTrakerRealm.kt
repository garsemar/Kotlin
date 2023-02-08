package cat.itb.martigarcia7e4.dam2.m06.uf3.exercicis

import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import io.realm.kotlin.ext.query
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import kotlinx.coroutines.*
import org.bson.types.ObjectId
import java.util.*

open class Sport2(
    @PrimaryKey
    var _id: ObjectId = ObjectId.get(),
    var sport: String = "",
    var duration_minutes: Int = 0,
    var owner_id: String = ""
) : RealmObject {
        // Declaring empty contructor
        constructor() : this(owner_id = "") {}
        //var doAfter: RealmList<Item>? = realmListOf()
        override fun toString() = "Sport($sport, $duration_minutes)"
}
@OptIn(DelicateCoroutinesApi::class)
fun main() {
    val scan = Scanner(System.`in`)

    val config = RealmConfiguration.Builder(setOf(Sport::class))
    .deleteRealmIfMigrationNeeded()
    // .directory("customPath")
    .build()
    println("Realm Path: ${config.path}")
     val realm = Realm.open(config)

    realm.writeBlocking {
        val item = Sport(sport = scan.next(), duration_minutes = scan.nextInt())
        copyToRealm(item)
    }

    /*GlobalScope.launch {
        repeat(3){
            realm.writeBlocking {
                val item = Sport(summary = "Local Only Some summary ${Date()}")
                copyToRealm(item)
            }
            delay(1000)
        }
        realm.close()
    }*/

    /*GlobalScope.launch {
        realm.query<Sport>().find().asFlow().collect{
            println(it.list.map{it.sport})
        }
    }*/
}