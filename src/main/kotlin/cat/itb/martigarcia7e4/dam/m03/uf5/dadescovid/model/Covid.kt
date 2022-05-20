package cat.itb.martigarcia7e4.dam.m03.uf5.dadescovid.model

import kotlinx.serialization.Serializable

@Serializable
data class Covid(val ID: String, val Message: String, val Global: Global, val Countries: List<Country>)