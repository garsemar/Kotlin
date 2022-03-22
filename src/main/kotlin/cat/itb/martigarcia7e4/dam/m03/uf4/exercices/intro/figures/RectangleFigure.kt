package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.intro.figures

data class RectangleFigure(val color: String, val width: Int, val height: Int){
    fun paint(){
        for(i in 1..width){
            for(j in 1..height){
                print("${color}X")
            }
            println()
        }
        println()
    }
}