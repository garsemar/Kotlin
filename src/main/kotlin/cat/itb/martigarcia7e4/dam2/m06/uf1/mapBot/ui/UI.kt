package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.ui

import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId

class UI {
    fun runBot(){
        val validCommands = listOf("/start")
        val bot = bot {
            token = "5642176017:AAFZqsx5VdWZ_CRRONBozM7Q13rCgNjOrcs"
            dispatch {
                command("start") {
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Hi there!")
                }
                text {
                    if(text.split(" ").first() !in validCommands){
                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Error")
                    }
                }
            }
        }
        bot.startPolling()
    }
}