package cat.itb.martigarcia7e4.dam.m03.uf1.iterative.project

import java.util.*

data class Evaluation(var rightPosition: Int, var wrongPosition: Int)
const val right = 0
const val wrong = 0
val eval = Evaluation(right, wrong)
fun main() {
    // Use only this scanner
    val scanner = Scanner(System.`in`)
    // Your code
    var i = 1
    var textSecret = ""
    println("Vols jugar en mode 1vs1 (1) o solitari (2)?")
    val whatGame = scanner.nextInt()
    if(whatGame == 1){
        print("Introdueix la paraula secreta: ")
        textSecret = scanner.next()
    }else {
        repeat(4) {
            textSecret += randomChar().toString()
        }
    }

    while(i <= 12) {
        print("Introdueix una combinació: ")
        val textGues = scanner.next()
        evaluateWord(textSecret, textGues)
        if(eval.rightPosition == 4){
            println("Enhorabona! has guanyat")
            break
        }else {
            println("Right position: ${eval.rightPosition}, wrong position: ${eval.wrongPosition}")
        }
        i += 1
    }
}

fun randomChar():Char {
    val allowedChars = 'A'..'F'
    return allowedChars.random()
}

fun evaluateWord(secret: String, guess: String) {
    eval.rightPosition = 0
    eval.wrongPosition = 0
    //Calculate your right and wrong positions and change it as you need
    for(i in 1..4) {
        val firstCS = secret[i - 1]
        if (guess[i - 1] == firstCS) {
            eval.rightPosition += 1
        } else {
            for (j in 1..4) {
                if (guess[i - 1] == secret[j - 1]) {
                    eval.wrongPosition += 1
                }
            }
        }
    }
}