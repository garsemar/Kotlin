package cat.itb.martigarcia7e4.dam2.m06.uf3.exercicis

import io.realm.kotlin.Realm
import io.realm.kotlin.ext.query
import io.realm.kotlin.mongodb.*
import io.realm.kotlin.mongodb.sync.SyncConfiguration
import io.realm.kotlin.types.ObjectId
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import java.util.*

open class Sport(
    @PrimaryKey
    var _id: ObjectId = ObjectId.create(),
    var sport: String = "null",
    var duration_minutes: Int = 0,
    var owner_id: String = ""
) : RealmObject {
    // Declaring empty contructor
    constructor() : this(owner_id = "") {}
    //var doAfter: RealmList<Item>? = realmListOf()
    override fun toString() = "Sport($sport, $duration_minutes)"
}

val realmApp = App.create(AppConfiguration.Builder("kotlin-sync-ifcih").build())

val scan = Scanner(System.`in`)

suspend fun main(){
    //login("itb", "contrasenyamuysegura")
    println("1: Login, 2: Register, 0: Exit")
    val input = scan.nextInt()
    while(true) {
        when (input) {
            0 -> return
            else -> {
                println("Username:")
                val user = scan.next()
                println("Password:")
                val pass = scan.next()
                when(input){
                    1 -> login(user, pass)
                    2 -> register(user, pass)
                }
            }
        }
        ui()
    }
}

fun ui(){
    val user = realmApp.currentUser!!

    val config = SyncConfiguration.Builder(user, setOf(Sport::class))
        .initialSubscriptions { realm ->
            add(
                realm.query<Sport>(),
                "All Items"
            )
        }
        .waitForInitialRemoteData()
        .build()
    val realm = Realm.open(config)
    GlobalScope.launch {
        realm.subscriptions.waitForSynchronization()
    }

    println("Welcome!")
    while(true){
        realm.writeBlocking {
            val sport = Sport(owner_id = user.id,
                sport = scan.next(),
                duration_minutes = scan.nextInt())
            copyToRealm(sport)
        }
        realm.subscriptions.refresh()

        println(user.id)
        println(realm.query<Sport>("owner_id = '${user.id}'").find())
    }
}

suspend fun login(user: String, pass: String) {
    val creds: Credentials = Credentials.emailPassword(user, pass)
    realmApp.login(creds)
}

suspend fun register(user: String, pass: String) {
    realmApp.emailPasswordAuth.registerUser(user, pass)
    login(user, pass)
}