package cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("recipes")
data class Recipes(val recipe: List<Recipe>)