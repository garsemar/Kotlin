package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.abstracts

data class VehicleBrand(val name: String, val country: String)

abstract class Model(open val name: String, open val brand: VehicleBrand)

data class BicycleModel(override val name: String, val gears: Int, override val brand: VehicleBrand): Model(name, brand){
    override fun toString(): String {
        return "BicycleModel{name=$name, gears=$gears, brand=VehicleBrand{name=${brand.name}, country=${brand.country}}}"
    }
}

data class ScooterModel(override val name: String, val power: Double, override val brand: VehicleBrand): Model(name, brand){
    override fun toString(): String {
        return "ScooterModel{name=$name, power=$power, brand=VehicleBrand{name=${brand.name}, country=${brand.country}}}"
    }
}

fun main() {
    val bicycle1 = BicycleModel("modelX", 5, VehicleBrand("lorem", "Togo"))
    val scooter = ScooterModel("s562", 45.3, VehicleBrand("lorem", "Togo"))

    println(bicycle1)
    println(scooter)
}