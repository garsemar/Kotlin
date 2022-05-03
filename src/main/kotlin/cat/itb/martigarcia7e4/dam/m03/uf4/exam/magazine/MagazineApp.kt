package cat.itb.martigarcia7e4.dam.m03.uf4.exam.magazine

/**
 * Creates the list of articles (Printables)
 */
fun createArticles(): List<Printable> {
    return listOf(
        Opinio("Higiene democràtica", "Esther Vera", "consectetur adipiscing elit. In metus turpis, varius a erat id, pretium finibus tortor."),
        Opinio("La inèrcia de l'estat", "Javier Perez Royo", "commodo odio sit amet, mollis felis. Morbi arcu justo, feugiat tincidunt tincidunt non."),
        Fotografic("Unspoken", "Lorena Ros", listOf("img14232.jpg", "img8467.jpg", "img1487.jpg"))
    )
}

fun main(){
    val articles : List<Printable> = createArticles()
    val printer = DummyMagazinePrinter()
    for(article in articles)
        article.print(printer)
}