package cat.itb.martigarcia7e4.dam.m03.uf4.exam.magazine

interface MagazinePrinter {
    /**
     * Prints the title and author of an article
     */
    fun printTitle(title: String, author: String)

    /**
     * Prints the text of an article
     */
    fun printText(text: String)

    /**
     * Prints the photos of an article
     */
    fun printPhotos(photos: List<String>)
}