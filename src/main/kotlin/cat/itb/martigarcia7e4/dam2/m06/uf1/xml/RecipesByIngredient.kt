package cat.itb.martigarcia7e4.dam2.m06.uf1.xml

import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe.Ingredient
import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe.Ingredients
import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe.Recipe
import cat.itb.martigarcia7e4.dam2.m06.uf1.xml.model.recipe.Recipes
import nl.adaptivity.xmlutil.serialization.XML
import java.util.Scanner
import kotlin.io.path.Path
import kotlin.io.path.readText

fun main() {
    val xml = Path("./src/main/kotlin/cat/itb/martigarcia7e4/dam2/m06/uf1/resources/receptes.xml").readText()

    val hola = Recipes(listOf(Recipe("Hola", Ingredients(listOf(Ingredient("2", "grams", "awd"))), "5")))
    val recipes: Recipes = XML.decodeFromString(xml)
    val ingre = Scanner(System.`in`).next()
    val recipesList = mutableListOf<Recipe>()
    for(i in recipes.recipe.indices){
        for(j in recipes.recipe[i].ingredients.ingredient){
            if(j.name == ingre){
                recipesList.add(recipes.recipe[i])
            }
        }
    }
    recipesList.sortByDescending { it.dificulty }
    println(recipesList)
}