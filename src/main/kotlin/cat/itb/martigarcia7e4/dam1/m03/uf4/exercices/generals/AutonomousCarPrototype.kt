package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.generals

enum class Direction{
    FRONT, LEFT, RIGHT
}

interface CarSensors{
    fun isThereSomethingAt(direction: Direction) : Boolean
    fun go(direction : Direction)
    fun stop()
}

class AutonomousCar(private val carSensors: CarSensors){
    fun doNextNSteps(n :Int){
        repeat(n){
            nextStep()
        }
    }

    private fun isPosibleGo(direction: Direction): Boolean{
        if(carSensors.isThereSomethingAt(direction)){
            return false
        }
        return true
    }
    fun nextStep(){
        if(isPosibleGo(Direction.FRONT)){
            carSensors.go(Direction.FRONT)
        }
        else if(isPosibleGo(Direction.RIGHT)){
            carSensors.go(Direction.RIGHT)
        }
        else if(isPosibleGo(Direction.LEFT)){
            carSensors.go(Direction.LEFT)
        }
        carSensors.stop()
    }
}