package cat.itb.martigarcia7e4.dam.m03.uf5.exam

import java.util.*

data class AirRecord(val any: Int, val mes: Int, val dia: Int, val no2: Float, val pm10: Float, val pm25: Float)

class AirQualityApp(val data: List<AirRecord>) {
    fun highNo2(): AirRecord {
        return data.sortedBy { it.no2 }.reversed()[0]
    }
    fun averagePm10(): Double {
        return data.filter { it.any >= 2021 }.map { it.pm10 }.average()
    }
    fun dangerousCount(): Int {
        return data.count { it.no2 > 4 || it.pm10 > 45 || it.pm25 > 15 }
    }
    fun worstNo22022(): MutableList<AirRecord> {
        val worst = mutableListOf<AirRecord>()
        for(i in 0..2){
            worst.add(data.filter { it.any == 2022 }.sortedBy { it.no2 }.reversed()[i])
        }
        return worst
    }
}

fun main() {
    val scan = Scanner(System.`in`).useLocale(Locale.US)

    val data = readList(scan)
    val airQualityApp = AirQualityApp(data)

    println("Max no2: ${airQualityApp.highNo2()}")
    println("Average Pm10: ${airQualityApp.averagePm10()}")
    println("Dangerous count: ${airQualityApp.dangerousCount()}")
    println("Worst no2 2022:")
    airQualityApp.worstNo22022().forEachIndexed {i, airRecord -> println("$i $airRecord") }
}

fun readList(scan: Scanner): List<AirRecord> {
    val list = mutableListOf<AirRecord>()
    repeat(scan.nextInt()) {
        list.add(AirRecord(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextFloat(), scan.nextFloat(), scan.nextFloat()))
    }
    return list
}