package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.inheritance

import java.lang.Double.max
import java.lang.Double.min

interface Switch{
    val turnedOn : Boolean
    fun toggle()
}
class SwitchImpl(override var turnedOn:Boolean =false) : Switch {
    override fun toggle(){
        turnedOn = !turnedOn
    }
}
interface Wheels {
    val position: Double
    fun move(distance: Double)
}
class WheelsImpl(private val switch: Switch, override var position: Double = 0.0) : Wheels {
    override fun move(distance: Double) {
        if(switch.turnedOn)
            position = max(0.0, position+distance)
    }
}
interface Arm {
    var openAngle: Double
    var altitude: Double
    fun updateAltitude(change : Int)
    fun updateAngle(change: Int)
}
class ArmImpl(private val switch: Switch, override var openAngle: Double =0.0, override var altitude : Double=0.0) : Arm {
    override fun updateAltitude(change : Int){
        if(switch.turnedOn)
            altitude= max(0.0,altitude+change)
    }
    override fun updateAngle(change: Int){
        if(switch.turnedOn)
            openAngle = min(max(0.0, openAngle+change), 360.0)
    }
}
class MovingMechanicalArm(private val switch: Switch = SwitchImpl(), private val wheels: Wheels = WheelsImpl(switch), private val arm: Arm = ArmImpl(switch))
    : Switch by switch, Arm by arm, Wheels by wheels{
    override fun toString(): String {
        return "MovingMechanicalArm(openAngle=$openAngle, altitude=$altitude, turnedOn=$turnedOn, position=$position)"
    }
}