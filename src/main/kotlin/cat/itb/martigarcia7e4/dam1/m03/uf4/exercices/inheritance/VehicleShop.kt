package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.inheritance

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
    val bicycle1 = BicycleModel("modelX", 5, VehicleBrand("lorem", "Togo"))
    val scooter = ScooterModel("s562", 45.3, VehicleBrand("lorem", "Togo"))

    println(bicycle1)
    println(scooter)
}