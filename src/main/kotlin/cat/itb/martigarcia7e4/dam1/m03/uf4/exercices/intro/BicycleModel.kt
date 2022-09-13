package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.intro

data class BicycleBrand(val name: String, val country: String)

data class BicycleModel(val name: String, val gear: Int, val brand: BicycleBrand)

fun main() {
    val bmwBrand = BicycleBrand("bmw", "españa")
    val xslBrand = BicycleBrand("xsl", "andorra")

    val rxBicycle = BicycleModel("rx3000", 4, xslBrand)
    val ziBicycle = BicycleModel("zi4000", 8, bmwBrand)

    println(rxBicycle)
    println(ziBicycle)
}