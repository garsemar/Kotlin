package cat.itb.martigarcia7e4.dam.m03.uf4.exam.magazine

/**
 * Printer that prints on the console
 */
class DummyMagazinePrinter : MagazinePrinter{
    override fun printTitle(title: String, author: String) {
        println("$title - $author")
        println("------------")
    }

    override fun printText(text: String) {
        println(text)
        println()
    }

    override fun printPhotos(photos: List<String>) {
        photos.forEach{ println(it) }
        println()
    }
}