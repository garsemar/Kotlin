package cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlElement

@Serializable
@SerialName("ingredient")
data class Ingredient(
    val ammount: String,
    val unit: String,
    val name: String
)
