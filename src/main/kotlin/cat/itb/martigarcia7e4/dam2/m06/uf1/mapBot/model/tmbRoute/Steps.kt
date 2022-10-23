package cat.itb.martigarcia7e4.dam2.m06.uf1.mapBot.model.tmbRoute

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Steps(
    @SerializedName("relativeDirection") var relativeDirection : String,
    @SerializedName("streetName") var streetName: String,
    @SerializedName("absoluteDirection") var absoluteDirection : String
)