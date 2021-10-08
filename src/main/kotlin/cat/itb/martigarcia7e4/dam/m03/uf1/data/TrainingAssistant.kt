package cat.itb.martigarcia7e4.dam.m03.uf1.data

import java.time.Year
import java.util.*

val scan = Scanner(System.`in`).useLocale(Locale.UK)

fun main(){
    welcome()
    ageCalculator()
    imcCalculator()
    trainingSchedule()
}
fun welcome() {
    println("Hello! My name is TrainingAssistant.")
    println("Please, tell me your name.")
    var nom = scan.nextLine()
    println("What a great name you have, $nom!")
}
fun ageCalculator() {
    val currentYear = Year.now().value
    println("Please, tell me which year you were born.")
    var any = scan.nextInt()
    any = currentYear - any
    var any2 = any+1
    println("You are between $any - $any2 years old. That's a good age for practicing sport.")
}
fun imcCalculator() {
    println("Let's check some of your parameters")
    println("Tell me your weight in kg")
    var pes = scan.nextInt()
    println("Tell me your height in m")
    var alt = scan.nextFloat()
    var imc = pes / (alt * alt)
    println("Your IMC is $imc")

    var inPeso = "False"
    var peso = "False"
    var soPeso = "False"
    var obPeso = "False"
    if(imc < 18.5){
        inPeso = "True"
    }else if(imc in 18.0..25.0){
        peso = "True"
    }else if(imc in 25.0..50.0){
        soPeso = "True"
    }else if(imc > 50){
        obPeso = "True"
    }

    println("Checking insufficient weight....  $inPeso")
    println("Checking normal weight.... $peso")
    println("Checking overweight.... $soPeso")
    println("Checking obesity.... $obPeso")
}
fun trainingSchedule() {
    println("I'll tell you your training plan.")
    println("How many hours would you like to train?")
    var hours = scan.nextInt()
    println("How many days can you train?")
    var days = scan.nextInt()
    var daysRes = (days%hours)-(hours-days)
    if(daysRes < 0){
        daysRes *= -1
    }
    var daysRes2 = days - daysRes
    var hoursRes = hours/daysRes
    var hoursRes2 = hours/daysRes2

    println("Your routine sport could be:")
    println("$daysRes days $hoursRes hours")
    println("$daysRes2 days $hoursRes2 hours")
}