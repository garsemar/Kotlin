package cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.intro

import cat.itb.martigarcia7e4.dam1.m03.uf4.exercices.intro.figures.*

fun main() {
    val rectangleRed = RectangleFigure(RED, 4, 5)
    val rectangleYellow = RectangleFigure(YELLOW, 2, 2)
    val rectangleGreen = RectangleFigure(GREEN, 3, 5)

    rectangleRed.paint()
    rectangleYellow.paint()
    rectangleGreen.paint()
}