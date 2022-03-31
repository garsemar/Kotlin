package cat.itb.martigarcia7e4.dam.m03.uf4.exercices.enums

enum class TextGrade {
    SUSPES, BE, NOTABLE, EXCELLENT
}

data class Student(val name: String, val textGrade: TextGrade)

fun main() {
    println(Student("Mar", TextGrade.SUSPES))
    println(Student("Joan", TextGrade.EXCELLENT))
}