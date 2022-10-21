package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.ui

import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.logic.Logic
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Location
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Place
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Place.Companion.places
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.repositories.Api
import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import kotlinx.coroutines.*

class UI {
    private val api = Api()
    private val logic = Logic()
    @OptIn(DelicateCoroutinesApi::class)
    fun runBot(){
        val validCommands = listOf("/start", "/help", "/set", "/list", "/delete", "/route")
        val bot = bot {
            token = "5665193864:AAFkozBlhou6PuK1aa_SmA_sdl9lyNRmmiI"
            dispatch {
                command("start") {
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Try /help")
                }
                command("help") {
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = """
                        /start - Start the bot
                        /set Place name Address without spaces(c/street,number,city) - Set a place
                        /list - List all places
                        /delete place name - Delete a place
                        /route [origin place name or address], [destination place name or address] - Get the route between two places
                        /help - Show this message
                    """.trimIndent())
                }
                command("set"){
                    val input = message.text?.split(" ")
                    if (input?.size == 3 && logic.addPlace(message.chat.id, input)) {
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Place saved correctly")
                    }
                    else{
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Invalid command")
                    }
                }
                command("list"){
                    if(places[message.chat.id]?.isNotEmpty() == true) {
                        places[message.chat.id]?.forEach {
                            bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "${it.name}: ${it.cords}")
                        }
                    }
                    else{
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "No places saved")
                    }
                }
                command("delete"){
                    val input = message.text?.split(" ")
                    places[message.chat.id]?.removeIf { it.name == input!![1] }
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Place deleted correctly")
                }
                command("route"){
                    /*
                    * if walk
                    1. Go NomCarrer numMetres direccio(Left, right)

                    if metro
                    1. Go Clot L1 direccio Fondo to La Sagrera
                    * */

                    val input = message.text!!.split(" ").toMutableList()
                    input.removeFirst()
                    val words = mutableListOf<List<Place>?>()
                    input.forEach { _ ->
                        words.add(places[message.chat.id]?.filter { it.name == it.toString() })
                    }
                    val routeList = mutableListOf<String>()
                    GlobalScope.launch {
                        for(i in input.indices){
                            if(words[i].isNullOrEmpty()){
                                val ad = api.googleGeo(input[i]).results[0].geometry.location
                                routeList.add("${ad.lat},${ad.lng}")
                            }
                            else{
                                routeList.add(words[i]!![0].cords)
                            }
                        }
                        bot.sendMessage(ChatId.fromId(message.chat.id), routeList.toString(), disableNotification = true)
                    }
                }
                text {
                    if(text.split(" ").first() !in validCommands){
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Error")
                    }
                }
            }
        }
        bot.startPolling()
        println("Running!")
    }

    fun formatCords(location: Location){

    }
}