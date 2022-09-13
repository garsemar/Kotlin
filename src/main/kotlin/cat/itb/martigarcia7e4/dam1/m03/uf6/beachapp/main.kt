package cat.itb.martigarcia7e4.dam1.m03.uf6.beachapp

import cat.itb.martigarcia7e4.dam1.m03.uf6.beachapp.ui.UI
import java.util.*

fun main() {
    val scan = Scanner(System.`in`).useLocale(Locale.UK)
    val ui = UI(scan)

    ui.menu()
}