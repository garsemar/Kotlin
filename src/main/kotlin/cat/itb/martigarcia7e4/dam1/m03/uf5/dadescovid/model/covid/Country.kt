package cat.itb.martigarcia7e4.dam1.m03.uf5.dadescovid.model.covid

import kotlinx.serialization.Serializable

@Serializable
data class Country(val Country: String, val CountryCode: String, val NewConfirmed: Int, val TotalConfirmed: Int, val NewDeaths: Int, val TotalDeaths: Int, val NewRecovered: Int, val TotalRecovered: Int, val Date: String)