package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid

import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.CountryCode
import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.Covid

suspend fun main() {
    val api = ApiConnect()

    val covid = api.getCovidData()
    val countryCode = api.getCountryCode()
    val countryTranslate = api.getCountryTranslate()

    val covidStats = CovidStats(covid)

    covidStats.totalDeaths()
    covidStats.newConfirmed()
    covidStats.euData()
}