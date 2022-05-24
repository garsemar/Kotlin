package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid

import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.*
import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.covid.*

class CovidStatsApp() {
    private val api = ApiConnect()
    lateinit var covid: Covid
    lateinit var countryCode: List<CountryCode>
    lateinit var countryTranslate: List<CountryTranslate>
    lateinit var stats: Stats
    suspend fun loadData() {
        covid = api.getCovidData()
        countryCode = api.getCountryCode()
        countryTranslate = api.getCountryTranslate()
        stats = Stats(covid, countryCode, countryTranslate)
    }
    fun totalDeaths() {
        println("#### Total Deaths ####")
        stats.totalDeaths().forEachIndexed {i, country ->
            if(i < 10){
                println("${i + 1}. ${country.Country} ${country.TotalDeaths}")
            }
        }
        println()
    }
    fun newConfirmed() {
        println("#### New Confirmed ####")
        stats.newConfirmed().forEachIndexed {i, country ->
            if(i < 10){
                println("${i + 1}. ${country.Country} ${country.NewConfirmed}")
            }
        }
        println()
    }
    fun euData(){
        val euData = stats.euData()
        println("#### EU data ####")
        println("Total Deaths: ${euData.totalDeath}")
        println("New confirmed: ${euData.newConfirmed}\n")
    }
    fun spainRelative(){
        println("### Spain Relative ###")
        println("#### SPAIN ####")
        println("Deaths per capita: ${stats.relative("ES")}%\n")
    }
    fun topRelative(){
        println("#### Death By Population ####")
        stats.topRelative().sortedByDescending { stats.relative(it.CountryCode) }.forEachIndexed {i, country ->
            if(i < 10){
                println("${i + 1}. ${country.Country} total: ${stats.translateCountry(country.CountryCode)?.population} rate: ${stats.relative(country.CountryCode)}%")
            }
        }
    }
}