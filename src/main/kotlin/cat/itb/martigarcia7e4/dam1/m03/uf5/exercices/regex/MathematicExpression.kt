package cat.itb.martigarcia7e4.dam1.m03.uf5.exercices.regex

fun main() {
    val input = "25+3(1+2+(304))/(2"

    val regexs = listOf(Regex("[()]"), Regex("[(]..[)]|[(][)]"))

    val matches = makeReadable(regexs[0].findAll(input))
    val res2 = makeReadable(regexs[1].findAll(matches))

    if(res2.length == matches.length) println("Correct")
    else println("Incorrect")
}

fun makeReadable(input: Sequence<MatchResult>): String {
    return input.map { it.value }.joinToString("")
}