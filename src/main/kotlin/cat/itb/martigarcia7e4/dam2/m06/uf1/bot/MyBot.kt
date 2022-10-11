package cat.itb.martigarcia7e4.dam2.m06.uf1.bot

import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.message
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.extensions.filters.Filter
import java.time.LocalDate
import java.util.Date

fun main() {
    val validCommands = listOf("/start", "/today", "/store", "/retrieve")
    val data = mutableMapOf<Long, MutableList<String>>()
    val bot = bot {
        token = "5642176017:AAFZqsx5VdWZ_CRRONBozM7Q13rCgNjOrcs"
        dispatch {
            message(Filter.Sticker) {
                bot.sendMessage(ChatId.fromId(message.chat.id), text = "You have received an awesome sticker \\o/")
            }
            message(Filter.Reply or Filter.Forward) {
                bot.sendMessage(ChatId.fromId(message.chat.id), text = "someone is replying or forwarding messages ...")
            }
            command("start") {
                bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Hi there!")
            }
            command("today"){
                bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = LocalDate.now().toString())
            }
            command("store"){
                data.set(message.chat.id, mutableListOf(args.last()))
            }
            command("retrieve"){
                data.filter { it.key == message.chat.id }.forEach {
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = it.value.toString())
                }
                println(data)
            }
            text {
                if(text.split(" ").first() !in validCommands){
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Error")
                }
            }
        }
    }
    println("run")
    bot.startPolling()
    println("aa")
}