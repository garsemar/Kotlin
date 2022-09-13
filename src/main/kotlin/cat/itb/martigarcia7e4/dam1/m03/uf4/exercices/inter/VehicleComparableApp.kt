package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.inter

interface VehicleShop{
    val bicycleList: MutableList<BicycleModel>
    val scooterList: MutableList<ScooterModel>
}

data class VehicleBrand(val name: String, val country: String)

open class Model(val name: String, val brand: VehicleBrand)

class BicycleModel(name: String, val gears: Int, brand: VehicleBrand): Model(name, brand){
    override fun toString(): String {
        return "BicycleModel{name=$name, gears=$gears, brand=VehicleBrand{name=${brand.name}, country=${brand.country}}}"
    }
}

class ScooterModel(name: String, val power: Double, brand: VehicleBrand): Model(name, brand){
    override fun toString(): String {
        return "ScooterModel{name=$name, power=$power, brand=VehicleBrand{name=${brand.name}, country=${brand.country}}}"
    }
}

fun main() {
    val bicycleList = mutableListOf(
        BicycleModel("modelX", 5, VehicleBrand("lorem", "Togo")),
        BicycleModel("modelZ", 2, VehicleBrand("lorem", "Togo")),
        BicycleModel("modelY", 6, VehicleBrand("lorem", "Togo"))
    )
    val scooterList = mutableListOf(
        ScooterModel("s562", 45.3, VehicleBrand("lorem", "Togo")),
        ScooterModel("y463", 25.2, VehicleBrand("lorem", "Togo")),
        ScooterModel("s672", 85.8, VehicleBrand("lorem", "Togo"))
    )

    bicycleList.forEach { println(it) }
    scooterList.forEach { println(it) }
    println("-------------------")
    bicycleList.sortBy { it.name }
    scooterList.sortBy { it.name }
    bicycleList.forEach { println(it) }
    scooterList.forEach { println(it) }
}