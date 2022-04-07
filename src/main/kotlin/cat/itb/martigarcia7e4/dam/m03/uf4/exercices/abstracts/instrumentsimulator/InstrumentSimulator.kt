package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.abstracts.instrumentsimulator

abstract class Instrument{
    abstract fun makeSounds(times: Int)
}

class Drump(private val model: String): Instrument(){
    override fun makeSounds(times: Int) {
        println("T$model$model${model}M")
    }
}
class Triangle(private val resonance: Int): Instrument(){
    override fun makeSounds(times: Int) {
        print("T")
        for(i in 1..resonance){
            print("I")
        }
        println("NC")
    }
}

fun main() {
    val instruments: List<Instrument> = listOf(
        Triangle(5),
        Drump("A"),
        Drump("O"),
        Triangle(1),
        Triangle(5)
    )
    play(instruments)
}

private fun play(instruments: List<Instrument>) {
    for (instrument in instruments) {
        instrument.makeSounds(2)
    }
}