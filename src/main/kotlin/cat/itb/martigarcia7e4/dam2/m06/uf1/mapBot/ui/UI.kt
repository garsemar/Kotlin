package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.ui

import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.logic.Logic
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.GoogleGeo
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Place
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.Place.Companion.places
import cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.repositories.Api
import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class UI {
    private val api = Api()
    private val logic = Logic()
    @OptIn(DelicateCoroutinesApi::class)
    fun runBot(){
        val validCommands = listOf("/start", "/help", "/set", "/list", "/delete", "/route")
        val bot = bot {
            token = ""
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
                /*command("set"){
                    val input = message.text?.split(" ")
                    if (input?.size == 3) {
                        logic.addPlace(message.chat.id, input)
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Place saved correctly")
                    }
                    else{
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Invalid command")
                    }
                }*/
                command("list"){
                    if(places.isNotEmpty()) {
                        places[message.chat.id]?.forEach {
                            bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "${it.name}: ${it.cords}")
                        }
                    }
                    else{
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "No places saved")
                    }
                }
                /*command("delete"){
                    val input = message.text?.split(" ")
                    places.removeIf { it.name == input!![1] }
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Place deleted correctly")
                }*/
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
}