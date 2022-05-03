package cat.itb.martigarcia7e4.dam.m03.uf4.exam.magazine

class Fotografic(private val titol: String, private val autor: String, private val fotos: List<String>): Printable{
    override fun print(magazinePrinter: MagazinePrinter) {
        magazinePrinter.printTitle(this.titol, this.autor)
        magazinePrinter.printPhotos(this.fotos)
    }
}