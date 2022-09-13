package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.intro

data class MechanicalArm(
    var status: Boolean = false,
    var angle: Int = 0,
    var altitude: Int = 0
){
    fun toggle(): Boolean {
        status = !status
        println(this)
        return status
    }

    fun updateAltitude(altitude: Int): Int {
        if(status) {
            this.altitude += altitude
            println(this)
            return altitude
        }
        println(this)
        return altitude
    }

    fun updateAngle(angle: Int): Int {
        if(status) {
            this.angle += angle
            println(this)
            return angle
        }
        println(this)
        return angle
    }
}

fun main() {
    val mechanicalArm = MechanicalArm()
    mechanicalArm.toggle()
    mechanicalArm.updateAltitude(3)
    mechanicalArm.updateAngle(180)
    mechanicalArm.updateAltitude(-3)
    mechanicalArm.updateAngle(-180)
    mechanicalArm.updateAltitude(3)
    mechanicalArm.toggle()
}