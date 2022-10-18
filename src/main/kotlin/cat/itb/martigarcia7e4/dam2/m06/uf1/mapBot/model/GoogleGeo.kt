package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GoogleGeo(
    @SerializedName("results") var results: List<Result>
)

@Serializable
data class Result(
    @SerializedName("geometry") var geometry: Geometry
)

@Serializable
data class Geometry(
    @SerializedName("location") var location: Location
)

@Serializable
data class Location(
    @SerializedName("lat") var lat: Double,
    @SerializedName("lng") var lng: Double
)