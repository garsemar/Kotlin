package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model

import kotlinx.serialization.Serializable

@Serializable
data class Global(val NewConfirmed: Int, val TotalConfirmed: Int, val NewDeaths: Int, val TotalDeaths: Int, val NewRecovered: Int, val TotalRecovered: Int)