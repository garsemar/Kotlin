package cat.itb.martigarcia7e4.dam2.m06.uf1.xml

import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe.Ingredient
import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe.Recipe
import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe.Recipes
import nl.adaptivity.xmlutil.serialization.XML
import kotlin.io.path.Path
import kotlin.io.path.readText

fun main() {
    val xml = Path("./src/main/kotlin/cat/itb/martigarcia7e4/dam2/m06/uf1/resources/receptes.xml").readText()

    val puta = Recipes(listOf(Recipe("Hola", listOf(Ingredient("2", "grams", "awd")))))
    val recipes: Recipes = XML.decodeFromString(xml)
    println(recipes)
}