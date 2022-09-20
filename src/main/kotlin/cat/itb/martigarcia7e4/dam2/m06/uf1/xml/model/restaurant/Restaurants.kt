package cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.restaurant

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("restaurants")
data class Restaurants(val restaurant: List<Restaurant>)