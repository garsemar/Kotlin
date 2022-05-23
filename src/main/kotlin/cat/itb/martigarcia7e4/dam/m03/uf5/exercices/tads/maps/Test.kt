package cat.itb.martigarcia7e4.dam.m03.uf5.exercices.tads.maps

data class Person(val name: String, val age: Int)

fun main(){
    val persons = listOf(Person("Mar", 25), Person("Pere", 14))
    val personsByName : Map<String, Person> = persons.associateBy{ it.name }
    println(personsByName)

    val set = mutableSetOf(1,2)
    set += 4
    set -= 1

    println(set)
}