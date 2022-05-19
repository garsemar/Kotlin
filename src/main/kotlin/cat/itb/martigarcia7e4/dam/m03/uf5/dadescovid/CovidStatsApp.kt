package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid

import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.ApiConnect

suspend fun main() {
    val api = ApiConnect("https://api.covid19api.com/summary")

    val covid = api.getData()

    covid.Countries.forEach {
        if(it.CountryCode == "ES") {
            println(it.Country)
            println(it.TotalConfirmed)
            println(it.TotalDeaths)
        }
    }
}