package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.intro

class Rectangle(val height:Double, val width:Double){
    val area get() = height * width
}

class Board(val rectangles: List<Rectangle>) {
    fun getTotalArea(): Double {
        var area = 0.0
        for (rectangle in rectangles) {
            area += rectangle.area
        }
        return area
    }
    fun countRectangles(): Int {
        return rectangles.size
    }
}

fun main() {
    val rectangles = listOf(Rectangle(2.2, 4.5), Rectangle(3.4, 1.5))
    val board = Board(rectangles)
    println(board.countRectangles())
    println(board.getTotalArea())
}