package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model

import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.covid.Country
import cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model.covid.Covid

data class EuData(val totalDeath: Int, val newConfirmed: Int)

class Stats(private val covid: Covid, private val countryCode: List<CountryCode>, private val countryTranslate: List<CountryTranslate>) {
    val euList = listOf("PE", "BE", "GR", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL")
    fun totalDeaths(): MutableList<Country> {
        val totalList = mutableListOf<Country>()
        covid.Countries.sortedByDescending { it.TotalDeaths }.forEach {
            totalList.add(it)
        }
        return totalList
    }
    fun newConfirmed(): MutableList<Country> {
        val totalList = mutableListOf<Country>()
        covid.Countries.sortedByDescending { it.NewConfirmed }.forEach {
            totalList.add(it)
        }
        return totalList
    }
    fun euData(): EuData {
        var totalDeath = 0
        var newConfirmed = 0
        covid.Countries.forEach { if(it.CountryCode in euList) totalDeath += it.TotalDeaths; newConfirmed += it.NewConfirmed }

        return EuData(totalDeath, newConfirmed)
    }
    fun relative(countryCode: String): Float {
        val death = covid.Countries.find { it.CountryCode == countryCode }?.TotalDeaths
        val pob = translateCountry(countryCode)?.population
        return (death?.toFloat()!!*100) / pob?.toFloat()!!
    }
    fun translateCountry(code: String): CountryCode? {
        val countryTranslate : Map<String, String> = countryTranslate.associate { it.short to it.long }
        return countryCode.find { it.code == countryTranslate[code] }
    }
    fun topRelative(): MutableList<Country> {
        val euList = mutableListOf<Country>()
        for(i in this.euList.indices){
            if(i >= 10) {
                break
            }
            euList.add(covid.Countries.first { this.euList[i] == it.CountryCode })
        }
        return euList
    }
}