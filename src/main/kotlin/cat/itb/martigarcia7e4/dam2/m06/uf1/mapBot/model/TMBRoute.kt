package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class TMBRoute(
    @SerializedName("plan") var plan: Plan = Plan()
)

@Serializable
data class Plan(
    @SerializedName("itineraries") var itineraries : List<Itineraries> = listOf()
)

@Serializable
data class Itineraries(
    @SerializedName("duration") var duration: Int,
    @SerializedName("walkTime") var walkTime: Int,
    @SerializedName("transitTime") var transitTime: Int,
    @SerializedName("legs") var legs : List<Legs> = listOf()
)

@Serializable
data class Legs(
    @SerializedName("mode") var mode: String,
    @SerializedName("route") var route: String,
    @SerializedName("from") var from: From = From(),
    @SerializedName("to") var to: To = To(),
    @SerializedName("steps") var steps: List<Steps> = listOf()
)

@Serializable
data class Steps(
    @SerializedName("relativeDirection") var relativeDirection : String,
    @SerializedName("streetName") var streetName: String,
    @SerializedName("absoluteDirection") var absoluteDirection : String
)

@Serializable
data class From(
    @SerializedName("name") var name: String? = null
)

@Serializable
data class To(
    @SerializedName("name") var name: String? = null
)