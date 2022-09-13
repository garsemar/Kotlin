package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.inheritance

enum class Colors(val nameC: String) {
    RED("\u001B[0;31m"),
    YELLOW("\u001b[0;33m"),
    GREEN("\u001b[0;32m"),
    RESET("\u001b[0m")
}

abstract class Figure(private val color: Colors, var altura: Int){
    abstract fun paint()
    fun prepareColor(){
        print(Colors.valueOf(color.toString()).nameC)
    }
    fun clearColor(){
        println(Colors.RESET.nameC)
    }
}

class LeftPiramidFigure(color: Colors, altura: Int): Figure(color, altura){
    override fun paint(){
        prepareColor()
        for(i in 1..altura){
            for(j in 1..i){
                print("X")
            }
            println()
            altura += 1
        }
        clearColor()
    }
}

class RectangleFigure(color: Colors, altura: Int, private val amplada: Int): Figure(color, altura){
    override fun paint(){
        prepareColor()
        for(i in 1..altura){
            for(j in 1..amplada){
                print("X")
            }
            println()
            altura += 1
        }
        clearColor()
    }
}

fun main() {
    RectangleFigure(Colors.RED, 4, 5).paint()
    LeftPiramidFigure(Colors.YELLOW, 3).paint()
    RectangleFigure(Colors.GREEN, 3, 5).paint()
}