package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.tmbRoute

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Itineraries(
    @SerializedName("duration") var duration: Int,
    @SerializedName("walkTime") var walkTime: Int,
    @SerializedName("transitTime") var transitTime: Int,
    @SerializedName("legs") var legs : List<Legs> = listOf()
)