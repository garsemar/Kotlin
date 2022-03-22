package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.intro

class MechanicalArm(){
    private var status: Boolean = false
    private var angle: Int = 0
    private var altitude: Int = 0

    fun setTurnedOn(status: Boolean){
        this.status = status
    }

    fun updateAltitude(altitude: Int){
        if(status) {
            this.altitude += altitude
        }
    }

    fun updateAngle(angle: Int){
        if(status) {
            this.angle += angle
        }
    }
}

fun main() {

}