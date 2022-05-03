package cat.itb.martigarcia7e4.dam.m03.uf4.exam.magazine

class Opinio(private val titol: String, private val autor: String, private val text: String): Printable{
    override fun print(magazinePrinter: MagazinePrinter) {
        magazinePrinter.printTitle(this.titol, this.autor)
        magazinePrinter.printText(this.text)
    }
}