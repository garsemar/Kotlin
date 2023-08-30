package garsemar.main

fun main() {
    val list: MutableList<String> = (1..100).map { it.toString() }.toMutableList()

    list.forEachIndexed { i, it ->

            if(it.toInt()%3==0 && it.toInt()%5==0) {
                list[i] = "FizzBuzz"
            }
            else if(it.toInt()%5==0) {
                list[i] = "Buzz"
            }
            else if(it.toInt()%3==0){
                list[i] = "Fizz"
            }
        }

    println(list)
}