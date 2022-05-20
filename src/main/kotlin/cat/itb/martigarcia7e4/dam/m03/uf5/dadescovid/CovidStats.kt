package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid

import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.Covid

class CovidStats(private val covid: Covid){
    fun totalDeaths(){
        var counter = 0
        println("#### Most deaths: ####")
        covid.Countries.sortedByDescending { it.TotalDeaths }.forEach {
            if(counter>= 10) {
                return
            }
            else{
                println("${counter + 1}. ${it.Country} ${it.TotalDeaths}")
            }
            counter += 1
        }
    }

    fun newConfirmed(){
        var counter = 0
        println("#### New confirmed ####")
        covid.Countries.sortedByDescending { it.NewConfirmed }.forEach {
            if(counter>= 10) {
                return
            }
            else{
                println("${counter + 1}. ${it.Country} ${it.NewConfirmed}")
            }
            counter += 1
        }
    }

    fun euData(){
        val euList = listOf("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL")

        var totalDeath = 0
        var newConfirmed = 0
        covid.Countries.forEach { if(it.CountryCode in euList) totalDeath += it.TotalDeaths; newConfirmed += it.NewConfirmed }

        println("#### EU data ####")
        println("Total Deaths: $totalDeath")
        println("New confirmed: $newConfirmed")
    }
}